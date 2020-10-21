package com.company.mvnstart.java8.lambda;

public class Closure {

    @FunctionalInterface
    interface IntConsumer {
        void accept(int value);
    }

    public static void repeat(int n, IntConsumer consumer) {
        for (int i = 0; i < n; i++) {
            consumer.accept(i);
        }
    }

    public static void main(String[] args) {
        // i -> System.out.println(i)
        Closure.repeat(10, System.out::println);
    }
}
