package com.company.base.jsont;

/**
 * @description: TODO
 * @author: 刘子豪 2021/1/25 11:02
 * @email: liuzihao29@jd.com
 */

public class BaseClass {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "id='" + id + '\'' +
                '}';
    }
}
