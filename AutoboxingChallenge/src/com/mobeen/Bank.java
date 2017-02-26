package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/24/2017.
 */
public class Bank {


    ArrayList<Branch> branchesList =  new ArrayList<>();

    public void addBranch(int branchCode){
    branchesList.add(new Branch(branchCode));
    }

    public void addCustomer(String customerName,int branchCode){
    int index = branchIndex(branchCode);
    if(index >=0){
        branchesList.get(index).addCustomer(customerName);
    }
    }

    public void addTransaction(String customerName, double amount, int branchCode){
        int index = branchIndex(branchCode);
        if (index >= 0) {

            branchesList.get(index).addTransaction(customerName,amount);
        }
    }

    public ArrayList<Customer> showCustomers(int branchCode){
        int index = branchIndex(branchCode);
        if(index>=0){
            return branchesList.get(index).getCustomersList();
        }
        else{
            return null;
        }
    }



    public int branchIndex(int branchCode) {
        for (int i = 0; i < branchesList.size(); i++) {
            if (branchesList.get(i).getBranchCode() == branchCode) {
                return i;
            }
        }
        return -1;
    }
}
