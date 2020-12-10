package com.company.mvnstart.java8.lambda;

import java.util.Comparator;

public class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) throws RuntimeException{
        return o1.length() - o2.length();
    }
}
