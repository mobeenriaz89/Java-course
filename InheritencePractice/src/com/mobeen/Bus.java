package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Bus extends Vehicle {
    public Bus(int numoftyres, String color, int numofdoor) {
        super(6, "black", 2);
    }

    @Override
    public void EngineStart(){
        System.out.println("Bus engine started");
    }
}
