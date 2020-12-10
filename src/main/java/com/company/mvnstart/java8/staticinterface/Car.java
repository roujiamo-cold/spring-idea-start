package com.company.mvnstart.java8.staticinterface;

public interface Car {
    default void print() {
        System.out.println("I'm a car!");
    }

    static void run() {
        System.out.println("A car is running.");
    }
}
