package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone myphone = new MobilePhone();
        boolean exit = false;
        int choice = 0;
        Contacts contact = new Contacts("mobeen", "123123");
        Contacts contact2 = new Contacts("haseeb", "999999");

        myphone.addContact(contact);
        myphone.addContact(contact2);
        while (!exit) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    System.out.println("Enter phone number:");
                    String number = scanner.next();
                    Contacts contact3 = new Contacts(name, number);
                    myphone.addContact(contact);

                    break;
                case 2:
                    System.out.println("Enter name to find:");
                    String findname = scanner.next();
                    System.out.println(myphone.findContact(findname));
                    break;
                case 3:
                    ArrayList<Contacts> list = new ArrayList<>(myphone.getContactsList());
                    for(int i=0; i<list.size();i++ ){
                        System.out.print(list.get(i).getContactName());
                        System.out.println(list.get(i).getContactNumber());


                    }
                    break;

                case 4:
                    System.out.println("ENter old name");
                    String oldContactname = scanner.next();
                    System.out.println("ENter new name");
                    String NewName = scanner.next();
                    System.out.println("ENter new number");
                    String NewNumber = scanner.next();
                    myphone.updateContact(oldContactname,NewName, NewNumber);
                    break;
                case 5:
                    System.out.println("Enter contact name to delete");
                    String contactName = scanner.next();
                    myphone.removeContact(contactName);
                break;
                case 6:
                    exit = true;
                    break;
            }
        }

    }
}
