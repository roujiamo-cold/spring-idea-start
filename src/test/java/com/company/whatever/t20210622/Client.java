package com.company.whatever.t20210622;

import java.util.Collections;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/22 10:47
 * @email: liuzihao29@jd.com
 */

public class Client {

    public Client(Worker... workers) {
        System.out.println(workers.length);
        for (Worker worker : workers) {
            worker.doSomething();
        }
    }
}
