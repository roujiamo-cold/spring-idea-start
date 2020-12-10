package com.company.effective.chapter3.article10.main;

import com.company.effective.chapter3.article10.CaseInsensitiveString;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: 刘子豪 2020/11/25 20:11
 */

public class Main {
    public static void main(String[] args) {
        // article10
        CaseInsensitiveStringTest();
    }

    private static void CaseInsensitiveStringTest() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Bob");
        String s = "bob";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));
    }
}
