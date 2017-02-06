package com.mobeen;

public class Main {

    public static void main(String[] args) {
    VipCustomer vip = new VipCustomer();
    System.out.println(vip.getName());

    VipCustomer vip2 = new VipCustomer("ali",400);
        System.out.println(vip2.getEmail());

        VipCustomer vip3 = new VipCustomer("nouman",50,"nouamn@ali.com");
        System.out.println(vip3.getEmail());
    }
}
