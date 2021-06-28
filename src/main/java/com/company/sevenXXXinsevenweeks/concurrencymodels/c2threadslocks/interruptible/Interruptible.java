package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.interruptible;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/21 14:47
 * @email: liuzihao29@jd.com
 */

public class Interruptible {

    public static void main(String[] args) throws InterruptedException {

        final ReentrantLock l1 = new ReentrantLock();
        final ReentrantLock l2 = new ReentrantLock();

        Thread t1 = new Thread() {
            public void run() {
                try {
                    l1.lockInterruptibly();
                    Thread.sleep(1000);
                    l2.lockInterruptibly();
                } catch (InterruptedException e) { System.out.println("t1 interrupted"); }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                    l2.lockInterruptibly();
                    Thread.sleep(1000);
                    l1.lockInterruptibly();
                } catch (InterruptedException e) { System.out.println("t2 interrupted"); }
            }
        };

        t1.start(); t2.start();
        Thread.sleep(2000);
        t1.interrupt(); t2.interrupt();
        t1.join(); t2.join();
    }
}
