package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/24/2017.
 */
public class Branch {

    int branchCode;

    public Branch(int branchCode) {
        this.branchCode = branchCode;
    }

    ArrayList<Customer> customersList = new ArrayList<>();

    public void addCustomer(String name){
        customersList.add(new Customer(name));
        customersList.get(customerIndex(name)).Transactions.add(500.0);
    }

    public int getBranchCode() {
        return branchCode;
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public void addTransaction(String customerName, double amount){
        int index = customerIndex(customerName);
        if(index >=0){
            customersList.get(index).Transactions.add(amount);
        }
    }

    public int customerIndex(String name){
        for(int i=0;i<customersList.size();i++){

            if(customersList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


}
