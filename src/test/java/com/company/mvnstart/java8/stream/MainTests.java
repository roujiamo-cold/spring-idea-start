package com.company.mvnstart.java8.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @description: TODO
 * @author: 刘子豪 2020/11/30 11:16
 */

public class MainTests {

    @Test
    public void forEach() {
        School school = new School();
        school.setStudents(Arrays.asList(new Student(0, "xiaoming", "1"),
                new Student(0, "xiaohong", "1"), null));

        System.out.println(school);

        school.getStudents().forEach(s -> {
            if ("xiaohong".equals(s.getName())) {
                s.setStatus("9");
            }
        });

        System.out.println(school);
    }

    @Test
    public void nullStr() {
        String s1 = "prefix";
        String s2 = null;
        String result = s1 + s2;
        System.out.println(result);
    }

    @Test
    public void lambdaBreak() {
        School school = new School();
        school.setStudents(Arrays.asList(new Student(0, "xiaoming", "1"),
                new Student(0, "xiaohong", "1"), new Student(0, "xiaoli", "1")));

        school.getStudents().forEach(student -> {
            if ("xiaoming".equals(student.getName())) {
                System.out.println("111");
                return;
            }

            System.out.println(student.getName());
        });
    }

    @Test
    public void lambdaForEachBreak() {
        School school = new School();
        school.setStudents(Arrays.asList(new Student(0, "xiaoming", "1"),
                new Student(0, "xiaohong", "1")));

        school.getStudents().stream().anyMatch(student -> {
            if ("xiaohong".equals(student.getName())) {
                System.out.println("111");
                return true;
            }

            System.out.println(student.getName());
            return false;
        });


    }
}
