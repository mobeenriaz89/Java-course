package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        initmenu();
    }

    private static void initmenu() {
        Bank mybank = new Bank();

        int branchCount = 1;
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        while (exit) {
            System.out.println("Enter your choice:\n" +
                    "1-Add Branch\n" +
                    "2-Add Customer\n" +
                    "3-Add Transaction\n" +
                    "4-Show branch Customers\n" +
                    "5-Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mybank.addBranch(branchCount);
                    branchCount++;
                    break;
                case 2:
                    System.out.println("Enter branch code:");
                    int branchCode = scanner.nextInt();
                    System.out.println("Enter new customer name:");
                    String newcustomerName = scanner.next();
                    mybank.addCustomer(newcustomerName, branchCode);
                    break;
                case 3:
                    System.out.println("Enter customer name:");
                    String customerName = scanner.next();
                    System.out.println("Enter amount:");
                    double amount = scanner.nextDouble();
                    System.out.println("Enter branch code:");
                    int branch = scanner.nextInt();
                    mybank.addTransaction(customerName, amount, branch);
                    break;
                case 4:
                    System.out.println("Enter branch code:");
                    int code = scanner.nextInt();
                    ArrayList<Customer> customerslist = mybank.showCustomers(code);
                    for (int i = 0; i < customerslist.size(); i++) {
                        System.out.println("Customer name:" + customerslist.get(i).getName()+"\n");
                        ArrayList<Double> transactions = customerslist.get(i).Transactions;
                        for(int j=0 ;j< transactions.size();j++) {
                            System.out.println("Transaction " + j + ":" + transactions.get(j) + "\n");
                        }
                    }
                    break;
                case 5:
                    exit = false;
                    break;
            }


        }
    }
}
