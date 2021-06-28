package com.company.buitin.classloader;

import java.util.Arrays;
import java.util.List;

/**
 * @description: TODO
 * @author: 刘子豪 2020/12/25 10:12
 * @email: liuzihao29@jd.com
 */

public class Main {
    public static void main(String[] args) {
        List<String> paths = Arrays.asList("sun.boot.class.path", "java.ext.dirs", "java.class.path");

        paths.forEach(path -> {
            System.out.println(path);
            Arrays.asList(System.getProperty(path).split(";")).forEach(System.out::println);
            System.out.println();
        });

        new Test().say();
    }
}
