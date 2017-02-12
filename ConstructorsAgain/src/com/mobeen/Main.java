package com.mobeen;

public class Main {

    public static void main(String[] args) {
    VipCustomer vip1 = new VipCustomer();
    System.out.println("hello Mr." + vip1.getName() +
            " your credit limit is " + vip1.getCreditLimit() +
    " and your email address is " + vip1.getEmailAddress());

        VipCustomer vip2 = new VipCustomer("mobeen","mobeen@gmail.com");
        System.out.println("hello Mr." + vip2.getName() +
                " your credit limit is " + vip2.getCreditLimit() +
                " and your email address is " + vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer("HASEEB",2244,"haseeb@gmail.com");
        System.out.println("hello Mr." + vip3.getName() +
                " your credit limit is " + vip3.getCreditLimit() +
                " and your email address is " + vip3.getEmailAddress());

    }
}
