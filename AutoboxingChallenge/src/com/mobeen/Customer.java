package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/24/2017.
 */
public class Customer {
    String name;
    ArrayList<Double> Transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }
}
