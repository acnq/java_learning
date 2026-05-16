package com.at.a_wn;

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
            synchronized (shop) {
                if (shop.isFlag() == true) {
                    // 有包子，生产线程需要等待
                    try {
                        shop.wait();;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 无包子：生产
                shop.setCount();
                // 生产完成修改状态：有包子
                shop.setFlag(true);
                // 唤醒消费
                shop.notify();
            }
        }
    }
}
