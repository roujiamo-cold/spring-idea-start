package com.company.mvnstart.java8.abstractclass;

/**
 * @author liuzihao
 * @create 2020-10-19 20:26
 **/
public abstract class AbstractPerson extends AbstractCommon{

    public abstract String subGet();

    public void print() {
        System.out.println("super print");
    }
}
