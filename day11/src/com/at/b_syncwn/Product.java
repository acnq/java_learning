package com.at.b_syncwn;

/**
 * 生产者
 */
public class Product implements Runnable{
    private Shop shop;
    public Product(Shop shop) {
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

            shop.setCount();
        }
    }
}
