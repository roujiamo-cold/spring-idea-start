package com.company.mvnstart.java8.methdrefrence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car<T, R> {

    private int price;

    public Car() {

    }

    public T apply(R r) {
        return null;
    }

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public boolean compare(Car another) {
        return this.price - another.price > 0;
    }

    public static void main(String[] args) {
        // 3. 构造器引用
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        // 1. Class::staticMethod 类的静态方法引用
        cars.forEach(Car::collide);

        final Car police = Car.create(Car::new);
        // 2. object::instanceMethod 实例对象的成员方法引用
        cars.forEach(police::follow);

        // 4. Class::instanceMethod 类的成员方法引用
        // 这一种情况第一个参数会成为方法的目标
        cars.forEach(Car::repair);

        String[] planets = new String[] { "A", "B", "b", "a"};
        Arrays.sort(planets, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(planets));


        Car<String, List<String>> stringListCar = new Car<>();
    }
}
