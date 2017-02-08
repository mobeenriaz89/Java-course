package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Bike extends Vehicle {
    public Bike(int numoftyres, String color, int numofdoor) {
        super(2, "Red", 0);
    }

    @Override
    public void EngineStart(){
        System.out.println("Bike engine started");
    }
}
