package com.mobeen;

/**
 * Created by Mobeen on 2/20/2017.
 */
public class Contacts {
    private   String contactName;
    private   String contactNumber;

    public Contacts(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }


}
