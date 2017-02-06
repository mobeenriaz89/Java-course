package com.mobeen;

/**
 * Created by Mobeen on 2/6/2017.
 */
public class VipCustomer {

    String name;
    int creditLimit;
    String email;

    public VipCustomer(){
        this("mobeen",100,"mobeenriaz89@gmail.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"haseeb@gmail.com");
    }



    public VipCustomer(String mobeen, int i, String s) {
        this.name = mobeen;
        this.creditLimit = i;
        this.email = s;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
