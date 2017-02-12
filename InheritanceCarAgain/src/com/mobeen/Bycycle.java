package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Bycycle extends Vehicle {
    public Bycycle(int wheels, int engine, boolean brake) {
        super(wheels, engine, brake);
    }

    @Override
    public void move() {
        pushPadles();
        super.move();
    }

    private void pushPadles() {
        System.out.println("pushing cycle padels");
    }
}
