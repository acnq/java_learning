package com.at.c_mwn;

public class Test01 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product product = new Product(shop);
        Consumer consumer = new Consumer(shop);

        new Thread(product).start();
        new Thread(product).start();
        new Thread(product).start();

        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
