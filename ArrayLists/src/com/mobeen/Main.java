package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        printMenu();
    }

    private static void printMenu() {
        Scanner scanner = new Scanner(System.in);

        GroceryList grocery = new GroceryList();
        boolean exit = false;

        while(!exit) {
            System.out.println("Enter 1 to show list");
            System.out.println("Enter 2 to add item");
            System.out.println("Enter 3 to read item");
            System.out.println("Enter 4 to update item");
            System.out.println("Enter 5 to delete item");
            System.out.println("Enter 6 to exit");


            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    grocery.printList();
                    break;
                case 2:
                    System.out.println("enter item name:");
                    String itemName = scanner.next();
                    grocery.addItem(itemName);
                    break;
                case 3:
                    System.out.println("enter item name to get its index:");
                    String index = scanner.next();
                    System.out.println(grocery.getItem(index));
                    break;
                case 4:
                    System.out.println("enter item name to update:");
                    String oldItemName = scanner.next();
                    System.out.println("enter new item name ");
                    String newItem = scanner.next();
                    grocery.editItem(oldItemName, newItem);
                    break;
                case 5:
                    System.out.println("enter item name to delete");
                    String itemtodelete = scanner.next();
                    grocery.removeItem(itemtodelete);
                    break;
                case 6:
                    exit = true;
                    break;

                case 7:
                    ArrayList<String> copyArray = new ArrayList<>();
                    copyArray.addAll(grocery.copyArray());



                    System.out.println( copyArray.get(2));


            }
        }
    }
}
