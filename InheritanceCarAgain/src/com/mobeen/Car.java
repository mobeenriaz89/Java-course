package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Car extends Vehicle {

    private int trunkSize;

    public Car(int wheels, int engine, boolean brake, int trunkSize) {
        super(wheels, engine, brake);
        this.trunkSize = trunkSize;
    }

    @Override
    public void move() {
        accelerate();
        super.move();
    }

    public void accelerate() {
        System.out.println("accelerating car");
    }
}
