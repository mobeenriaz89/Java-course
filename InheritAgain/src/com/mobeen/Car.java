package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Car extends Vehicle {

    public Car(){
        this(4,false);
    }

    public Car(int tyreNum, boolean iflighton) {
        super(tyreNum, iflighton);
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine started");
        super.startEngine();
    }
}
