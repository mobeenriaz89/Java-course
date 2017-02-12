package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Vehicle {

    private int wheels;
    private int engine;
    private boolean brake;

    public Vehicle(int wheels, int engine, boolean brake) {
        this.wheels = wheels;
        this.engine = engine;
        this.brake = brake;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public boolean isBrake() {
        return brake;
    }

    public void move(){

        System.out.println(" vehicle start moving");


    }

    public void stop(){

            System.out.println(" vehicle stop moving");

    }
}

