package com.company.base.jsont;

/**
 * @description: TODO
 * @author: 刘子豪 2021/1/25 11:03
 * @email: liuzihao29@jd.com
 */

public class Person extends BaseClass{

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                super.toString() + '\'' +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
