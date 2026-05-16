package com.at.a_wn;

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
    public void getCount() {
        System.out.println("消费了第" + count + "个包子");
    }

    /**
     * set: 为生产线程服务
     */
    public void setCount() {
        count++;
        System.out.println("生产了第" + count + "个包子");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
