package com.company.effective.chapter2.article8;


import sun.misc.Cleaner;

/**
 * @description: TODO
 * @author: 刘子豪 2020/11/25 19:42
 */

public class Room implements AutoCloseable {


    @Override
    public boolean equals(Object obj) {
        throw  new AssertionError();
    }

    @Override
    public void close() throws Exception {

    }
}
