package com.company.mvnstart.java8.ofnull;

import com.company.mvnstart.java8.stream.Student;
import org.junit.jupiter.api.Test;

import java.util.Objects;

/**
 * @description: TODO
 * @author: 刘子豪 2020/12/3 20:40
 * @email: liuzihao29@jd.com
 */

public class TestNull {

    @Test
    public void TestNull() {
        Object str = null;
        Student s = (Student) str;

        System.out.println(s);
    }
}
