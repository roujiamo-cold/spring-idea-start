package com.company.mvnstart.java8.abstractclass;

/**
 * @author liuzihao
 * @create 2020-10-19 20:28
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.subGet();

        System.out.println(ICommonPerson.CONST);
    }
}
