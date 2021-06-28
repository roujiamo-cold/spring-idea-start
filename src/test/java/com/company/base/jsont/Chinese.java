package com.company.base.jsont;

/**
 * @description: TODO
 * @author: 刘子豪 2021/1/25 11:05
 * @email: liuzihao29@jd.com
 */

public class Chinese extends Person {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                super.toString() + '\'' +
                "language='" + language + '\'' +
                '}';
    }
}
