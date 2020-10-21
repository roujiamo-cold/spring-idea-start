package com.company.mvnstart.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 发现 type 为 grocery 的所有交易，然后返回以交易值降序排序好的交易 ID 集合
 */
public class Compare7 {

    List<Transaction> groceryTransactions = new ArrayList<>();

    /**
     * Java 7 的排序、取值实现
     */
    public List<Integer> syntax7() {

        List<Transaction> transactions = new ArrayList<>();

        for(Transaction t: groceryTransactions){
            if(t.getType() == Transaction.GROCERY){
                transactions.add(t);
            }
        }
        Collections.sort(transactions, new Comparator<Transaction>(){
            @Override
            public int compare(Transaction t1, Transaction t2){
                return t2.getValue().compareTo(t1.getValue());
            }
        });

        List<Integer> transactionIds = new ArrayList<>();

        for(Transaction t: transactions){
            transactionIds.add(t.getId());
        }

        return transactionIds;
    }

    /**
     * Java 8 的排序、取值实现
     */
    public List<Integer> syntax8() {

        List<Integer> transactionsIds = groceryTransactions.parallelStream().
                filter(t -> t.getType() == Transaction.GROCERY).
                sorted(Comparator.comparing(Transaction::getValue).reversed()).
                map(Transaction::getId).
                // TODO: 调用形式
                collect(Collectors.toList());

        return transactionsIds;
    }
}

class Transaction {

    public static final int GROCERY = 0;

    private Integer id;
    private Integer type;
    private Integer value;

    public Integer getId() {
        return id;
    }

    public Integer getType() {
        return type;
    }

    public Integer getValue() {
        return value;
    }
}