package com.finance.beans;

import org.springframework.stereotype.Repository;

/**
 * Created by taylor on 11/5/15.
 */
@Repository
public class Payment {
    private Integer id;
    private String name;
    private double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
