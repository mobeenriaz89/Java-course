package com.mobeen;

/**
 * Created by Mobeen on 2/22/2017.
 */
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
