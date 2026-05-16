package com.at.b_syncwn;

public class Test01 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product = new Product(shop);
        Consumer consumer = new Consumer(shop);

        Thread t1 = new Thread(product);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
