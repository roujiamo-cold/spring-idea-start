package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.puzzle;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/18 14:19
 * @email: liuzihao29@jd.com
 */

public class Puzzle {
    static boolean answerReady = false;
    static int answer = 0;

    static Thread t1 = new Thread(() -> {
        answer = 42;
        answerReady = true;
    });

    static Thread t2 = new Thread(() -> {
//        if (answerReady) {
//            System.out.println("The meaning of life is: " + answer);
//        } else {
//            System.out.println("I don't know the answer");
//        }
        while (!answerReady) {
            try {
                System.out.println("sleep");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The meaning of life is: " + answer);
    });

    public static void main(String[] args) throws InterruptedException {
        t2.start();
        t1.start();
        t1.join();
        t2.join();
    }
}
