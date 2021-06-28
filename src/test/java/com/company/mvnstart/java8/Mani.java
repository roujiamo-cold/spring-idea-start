package com.company.mvnstart.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: 刘子豪 2021/5/27 10:54
 * @email: liuzihao29@jd.com
 */

public class Mani {

    static List<String> tmp = new ArrayList<>();

    static List<String> f = tmp;

    private static final String s = "1_";

    public static void main(String[] args) {
//        tmp = new ArrayList<String>(){
//            {
//                add("q234");
//                add("34435");
//            }
//        };
//
//        System.out.println(tmp);
//
//        System.out.println(f);
        String newS = s + 0;

        System.out.println(newS);
    }
}
