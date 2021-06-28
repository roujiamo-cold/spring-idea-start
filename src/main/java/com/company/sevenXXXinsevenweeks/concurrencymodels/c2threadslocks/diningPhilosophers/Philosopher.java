package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.diningPhilosophers;

import java.util.Random;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/18 14:32
 * @email: liuzihao29@jd.com
 */

public class Philosopher extends Thread {
    private int id;
    private Chopstick first, second;
    private Random random;

    public Philosopher(int id, Chopstick first, Chopstick second) {
        this.id = id;
        if (first.getId() < second.getId()) {
            this.first = first;
            this.second = second;
        } else {
            this.first = second;
            this.second = first;
        }
        random = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("P" + id + "thinking...");
                Thread.sleep(random.nextInt(1000));
                synchronized (first) {
                    synchronized (second) {
                        System.out.println("P" + id + "eating...");
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();
        Philosopher p1 = new Philosopher(1, c1, c2);
        Philosopher p2 = new Philosopher(2, c2, c3);
        Philosopher p3 = new Philosopher(3, c3, c4);
        Philosopher p4 = new Philosopher(4, c4, c5);
        Philosopher p5 = new Philosopher(5, c5, c1);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
    }
}
