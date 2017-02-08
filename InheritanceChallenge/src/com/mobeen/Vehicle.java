package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Vehicle {

    int numOfTyre;

    public Vehicle(int numOfTyre) {
        this.numOfTyre = numOfTyre;
    }

    public void handleSteering(){
        System.out.println("Vehicle handle steering called");
    }

    public void changeGear(){
        System.out.println("Vehicle change gear called");
    }

    public void move(){
        System.out.println("Vehicle move called");
    }

}
