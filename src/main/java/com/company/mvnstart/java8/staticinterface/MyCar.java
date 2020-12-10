package com.company.mvnstart.java8.staticinterface;

public class MyCar implements Car {

    public static void run() {
        System.out.println("My car is running");
    }

    public static void main(String[] args) {
        Car.run();
        Car myCar = new MyCar();
        MyCar.run();
    }
}
