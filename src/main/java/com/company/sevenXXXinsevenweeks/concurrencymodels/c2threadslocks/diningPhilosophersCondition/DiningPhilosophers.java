package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.diningPhilosophersCondition;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/25 10:20
 * @email: liuzihao29@jd.com
 */

public class DiningPhilosophers {

    public static void main(String[] args) throws InterruptedException {
        Philosopher[] philosophers = new Philosopher[5];
        ReentrantLock table = new ReentrantLock();

        for (int i = 0; i < 5; ++i)
            philosophers[i] = new Philosopher(table);
        for (int i = 0; i < 5; ++i) {
            philosophers[i].setLeft(philosophers[(i + 4) % 5]);
            philosophers[i].setRight(philosophers[(i + 1) % 5]);
            philosophers[i].start();
        }
        for (int i = 0; i < 5; ++i)
            philosophers[i].join();
    }
}
