package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.diningPhilosophersTimeout;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/21 14:53
 * @email: liuzihao29@jd.com
 */
public class DiningPhilosophers {

    public static void main(String[] args) throws InterruptedException {
        Philosopher[] philosophers = new Philosopher[5];
        ReentrantLock[] chopsticks = new ReentrantLock[5];

        for (int i = 0; i < 5; ++i)
            chopsticks[i] = new ReentrantLock();
        for (int i = 0; i < 5; ++i) {
            philosophers[i] = new Philosopher(chopsticks[i], chopsticks[(i + 1) % 5]);
            philosophers[i].start();
        }
        for (int i = 0; i < 5; ++i)
            philosophers[i].join();
    }
}
