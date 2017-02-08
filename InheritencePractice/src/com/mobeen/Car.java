package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Car extends Vehicle {

    public Car(int numoftyres, String color, int numofdoor) {
        super(4, "red", 4);
    }




    @Override
    public void EngineStart(){
        System.out.println("Car engine started");
    }
}
