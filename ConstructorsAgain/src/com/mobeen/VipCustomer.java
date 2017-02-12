package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String n, int cl, String eA){
        this.name = n;
        this.creditLimit = cl;
        this.emailAddress = eA;
    }

    public VipCustomer(){
        this("default name", 1, "default@email.com");
    }

    public VipCustomer(String name2, String email2){
        this(name2,2,email2);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
