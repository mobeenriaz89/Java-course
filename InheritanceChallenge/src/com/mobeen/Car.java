package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Car extends Vehicle {
    private int numofgears;


    public Car(int numOfTyre, int numofgears) {
        super(numOfTyre);
        this.numofgears = numofgears;
    }

    @Override
    public void handleSteering(){
        System.out.println("Car handle steering called");
    }
    @Override
    public void changeGear(){
        System.out.println("Car change gear called");
    }
   /* @Override
    public void move(){
        System.out.println("Car move called");
    }*/
}
