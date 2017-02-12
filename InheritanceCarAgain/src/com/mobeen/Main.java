package com.mobeen;

public class Main {

    public static void main(String[] args) {

        Honda city = new Honda("city");
        System.out.println("Vehicle name is " + city.getModelName());
        city.getCarDetails("city");

        Bycycle bmx = new Bycycle(2,0,false);
        bmx.move();

    }
}
