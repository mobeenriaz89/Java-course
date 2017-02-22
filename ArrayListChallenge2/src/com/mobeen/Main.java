package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        initPhone();
    }

    private static void initPhone() {
        MobilePhone myPhone = new MobilePhone();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;


        while (exit) {

            System.out.println("Select your option:\n" +
                    "1-View Your Contacts\n" +
                    "2-Add a new Contact\n" +
                    "3-Update an existing contact\n" +
                    "4-Delete a Contact\n" +
                    "5-Exit phone application");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<Contact> thePhoneList = new ArrayList<>(myPhone.getContactsList());
                    for(int i=0; i<thePhoneList.size(); i++){
                        System.out.println("Name:" + thePhoneList.get(i).getName() + "\t Number:"+ thePhoneList.get(i).getNumber() );
                    }
                    break;

                case 2:
                    System.out.println("Enter Contact name:");
                    String name = scanner.next();
                    System.out.println("Enter contact number:");
                    String number = scanner.next();
                    if(myPhone.addContact(new Contact(name,number))){
                        System.out.println("Contact added successfully");
                    }else{
                        System.out.println("This contact already exists");
                    }
                    break;

                case 3:
                    System.out.println("Enter Contact name:");
                    String nametoupdate = scanner.next();
                    System.out.println("Enter New Contact name:");
                    String newname = scanner.next();
                    System.out.println("Enter new contact number:");
                    String newnumber = scanner.next();

                    if(myPhone.updateContact(nametoupdate,newname,newnumber)){

                        System.out.println("Contact updated successfully");
                    }else{
                        System.out.println("This contact doesnt exist");
                    }
                    break;

                case 4:
                    System.out.println("Enter Contact name to delete:");
                    String nametodelete = scanner.next();

                    if(myPhone.deleteContact(nametodelete)){
                        System.out.println("Contact deleted successfully");
                    }else{
                        System.out.println("This contact doesnt exist");
                    }
                    break;

                case 5:
                    exit = false;
                    break;
            }
        }
    }
}
