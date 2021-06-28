package com.company.ext.org.mapstruct.xminutes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;

    //constructor, getters, setters etc.

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("123456");
        l.add("456789");

        System.out.println(l);
    }
}


