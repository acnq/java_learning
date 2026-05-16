package com.at.b_syncwn;

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
            shop.getCount();
        }
    }
}
