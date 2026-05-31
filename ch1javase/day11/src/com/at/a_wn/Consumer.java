package com.at.a_wn;

/**
 * 消费者
 */
public class Consumer implements Runnable {
    private Shop shop;
    public Consumer(Shop shop) {
        this.shop = shop;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (shop) {
                if (shop.isFlag() == false) {
                    // 没有包子：消费现成等待
                    try {
                        shop.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 有包子：消费
                shop.getCount();
                // 修改状态
                shop.setFlag(false);
                // 唤醒生产线程
                shop.notify();
            }
        }
    }
}
