package com.mobeen;

/**
 * Created by Mobeen on 2/5/2017.
 */
public class BankAccount {
    private String acc_num;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_num;
    
    public BankAccount(String acc_num, double balance, String customer_name, String email, String Phone_num){
        this.acc_num = acc_num;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_num = Phone_num;
        
    }

    public void setAcc_num(String account_number){
        this.acc_num = account_number;
    }

    public String getAcc_num(){
        return this.acc_num;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomer_name(String Customer_name){
        this.customer_name = Customer_name;
    }

    public String  getCustomer_name(){
        return this.customer_name;
    }

    public void setEmail(String Email){
        this.email = Email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhone_num(String Phone_num){
        this.phone_num = Phone_num;
    }

    public String getPhone_num(){
        return this.phone_num;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Mr."+ this.customer_name + " Rs." + amount +" has been added to your account number " + this.acc_num + "\n" +
                " Your new balance is: Rs." + this.balance);
    }

    public boolean withDraw(double amount){
        if(this.balance >=500 && amount >= 500 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Mr."+ this.customer_name + " Rs." + amount +" has been deducted from your account number " + this.acc_num + "\n" +
                    " Your new balance is: Rs." + this.balance);
            return true;
        }else{
            System.out.println("Mr."+ this.customer_name + "Sorry, either you have not entered valid amount or you balance is not sufficient" + "\n" +
                    " Your current balance is: Rs." + this.balance);

            return  false;
        }
    }
}
