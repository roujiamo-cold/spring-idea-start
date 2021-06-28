package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.counting;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/18 14:12
 * @email: liuzihao29@jd.com
 */

public class Couting {
    public static void main(String[] args) throws InterruptedException {
        class Counter {
            private int count = 0;
            public synchronized void increment() {
                ++count;
            }
            public int getCount() {
                return count;
            }
        }
        final Counter counter = new Counter();
        class CountingThread extends Thread {
            @Override
            public void run() {
                for (int x=0; x < 10000; ++x) {
                    counter.increment();
                }
            }
        }
        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
