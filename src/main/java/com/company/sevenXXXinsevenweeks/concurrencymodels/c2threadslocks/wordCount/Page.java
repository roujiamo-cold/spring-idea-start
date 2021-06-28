package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.wordCount;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/25 10:55
 * @email: liuzihao29@jd.com
 */

class Page {
    private String title;
    private String text;

    public Page(String title, String text) { this.title = title; this.text = text; }

    public String getTitle() { return title; }
    public String getText() { return text; }
}