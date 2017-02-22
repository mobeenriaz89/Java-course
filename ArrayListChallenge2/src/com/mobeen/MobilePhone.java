package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/22/2017.
 */
public class MobilePhone {

    ArrayList<Contact> contactsList ;

    public MobilePhone() {
        this.contactsList = new ArrayList<>();
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }

    //functions
    public boolean addContact(Contact newContact) {
        int contactIndex = getContactIndex(newContact.getName());
        if(contactIndex  == -1) {
                contactsList.add(newContact);
                return true;
            } else {
                return false;
            }
    }

    public boolean deleteContact(String delContactname){
        int indextodelete = getContactIndex(delContactname);
        if(indextodelete >= 0){
            contactsList.remove(indextodelete);
            return true;
        }else{
            return  false;
        }
    }

    public boolean updateContact(String oldName, String newName, String newNumber){
        int contactIndex = getContactIndex(oldName);
        if(contactIndex>=0)
        {
            contactsList.set(contactIndex, new Contact(newName, newNumber));
        return true;
        }else{
            return false;
        }
    }

    public int getContactIndex(String name){
        for(int i=0; i<contactsList.size(); i++){
            if(contactsList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }



}
