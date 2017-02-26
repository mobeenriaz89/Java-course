package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/20/2017.
 */
public class MobilePhone {

    private ArrayList<Contacts> contactsList = new ArrayList<>();

    public MobilePhone() {
        this.contactsList = new ArrayList<Contacts>();
    }


    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }

    public String findContact(String name){
        int contactIndex = findNumber(name);
        return this.contactsList.get(contactIndex).getContactNumber();
    }

    public void addContact(Contacts contact){
        this.contactsList.add(contact);
    }

    public void removeContact(String name){
        int contactIndex = findNumber(name);
        this.contactsList.remove(contactIndex);
    }

    public void updateContact(String oldName,String newName, String newNumber){
        int Oldnameindex = findNumber(oldName);

        this.contactsList.set(Oldnameindex, new Contacts(newName,newNumber));
    }

    public ArrayList<Contacts> readContacts(){
        return contactsList;
    }

    public int findNumber(String name){
        for(int i=0; i<this.contactsList.size(); i++)
        {
            Contacts contact = this.contactsList.get(i);
            String theName = contact.getContactName();
            if(theName.equals(name))
            {
                return i;
            }
        }
        return -1;
    }

}
