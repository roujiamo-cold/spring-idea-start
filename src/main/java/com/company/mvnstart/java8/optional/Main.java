package com.company.mvnstart.java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional< String > fullName = Optional.ofNullable( null );
//        System.out.println( "Full Name is set? " + fullName.isPresent() );
//        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
//        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
//
//        Optional< String > firstName = Optional.of( "Tom" );
//        System.out.println( "First Name is set? " + firstName.isPresent() );
//        System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) );
//        System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
//        System.out.println();

        String strA = " abcd ", strB = null;
        print(strA);
        print("");
        print(strB);
        getLength(strA);
        getLength("");
        getLength(strB);

        System.out.println(1);
    }

    public static void print(String text) {
        // Java 8
        Optional.ofNullable(text).ifPresent(System.out::println);
        // Pre-Java 8
        if (text != null) {
            System.out.println(text);
        }
    }

    public static int getLength(String text) {
        // Java 8
        return Optional.ofNullable(text).map(String::length).orElse(-1);
        // Pre-Java 8
//        return text != null ? text.length() : -1;
    };
}
