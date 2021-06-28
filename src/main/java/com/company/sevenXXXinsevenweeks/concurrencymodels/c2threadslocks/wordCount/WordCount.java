package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.wordCount;

import java.util.HashMap;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/25 10:55
 * @email: liuzihao29@jd.com
 */

public class WordCount {
    private static final HashMap<String, Integer> counts =
            new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        Iterable<Page> pages = new Pages(50000, "D:\\local\\tmp\\enwiki\\enwiki.xml");
        for(Page page: pages) {
            Iterable<String> words = new Words(page.getText());
            for (String word: words)
                countWord(word);
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) + "ms");

        // for (Map.Entry<String, Integer> e: counts.entrySet()) {
        //   System.out.println(e);
        // }
    }

    private static void countWord(String word) {
        Integer currentCount = counts.get(word);
        if (currentCount == null)
            counts.put(word, 1);
        else
            counts.put(word, currentCount + 1);
    }
}
