package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.helloworld;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/18 11:20
 * @email: liuzihao29@jd.com
 */

public class HelloWorld {
    public static void main(String[] args) throws Exception{
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("Hello from new thread");
            }
        };

        myThread.start();
        Thread.yield();
        System.out.println("Hello from main thread");
        myThread.join();
    }
}
