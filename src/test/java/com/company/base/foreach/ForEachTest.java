package com.company.base.foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: TODO
 * @author: 刘子豪 2021/5/10 14:46
 * @email: liuzihao29@jd.com
 */

public class ForEachTest {

    @Test
    public void testForEachEmptyList() {
        List<String> l = new ArrayList<>();
        for (String s : l) {
            System.out.println("111");
        }
    }

    @Test
    public void testForEachNullList() {
        List<String> l = null;
        for (String s : l) {
            System.out.println("111");
        }
    }

    class Student {
        String name;
        Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @Test
    public void testForEachUpdate() {
        List<Student> students = Arrays.asList(new Student("xiaoming", 12), new Student("xiaohong", 13));
        students.forEach(student -> {
            student.age = 11;
        });
        System.out.println(students);
    }

    @Test
    public void testSwitch() {
        String s = "A";
        switch (s) {
            case "C":
                System.out.println("cccccccc");
            case "A":
                System.out.println("aaaaaaaa");
                /*
                 * 注意：此处如果没有添加break，则代码会继续执行，即使不满足case条件也会执行，直到遇到break
                 */
                //break;
            case "B":
                System.out.println("bbbbbbbb");
                break;

            default:
                System.out.println("others");
                break;
        }
    }

    @Test
    public void testNullLongCompare() {
        Long l1 = null;
        Long l2 = null;
        System.out.println(Long.compare(l2, l1));
    }
}
