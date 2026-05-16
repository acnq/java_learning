package com.at.b_syncwn;

public class Shop {
    private int count;
    private boolean flag;

    public Shop() {}

    public Shop(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    /**
     * get: 为消费线程服务
     */
    public synchronized void getCount() {
        if (this.flag == false) {
            // 没有包子，消费线程等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 有包子：消费
        System.out.println("消费了第" + count + "个包子");
        // 修改状态表示无包子
        this.flag = false;
        // 唤醒生产线程
        this.notify();
    }

    /**
     * set: 为生产线程服务
     */
    public synchronized void setCount() {
        if (this.flag == true) {
            // 有包子：等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 无包子：生产
        count++;
        System.out.println("生产了第" + count + "个包子");
        // 修改状态表示有包子
        this.flag = true;
        // 唤醒消费线程
        this.notify();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
