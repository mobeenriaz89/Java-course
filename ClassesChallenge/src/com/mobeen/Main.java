package com.mobeen;

public class Main {

    public static void main(String[] args) {
    BankAccount useraccount = new BankAccount("12365654654",200000,"Mobeen Riaz", "mobeenriaz89@gmail.com","03135678420");
    /*useraccount.setAcc_num("12365654654");
    useraccount.setCustomer_name("Mobeen Riaz");
    useraccount.setEmail("mobeenriaz89@gmail.com");
    useraccount.setPhone_num("03135678420");
    useraccount.setBalance(200000);*/

    useraccount.depositFunds(100);
    useraccount.withDraw(199600);
        useraccount.withDraw(400);

    }
}
