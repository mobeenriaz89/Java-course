package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Vehicle {

    private int numoftyre;
    private boolean isLighton;

    public int getNumoftyre() {
        return numoftyre;
    }

    public boolean isLighton() {
        return isLighton;
    }

    public Vehicle(){
        this(1,true);

}

public Vehicle(int tyreNum, boolean iflighton){
    this.numoftyre = tyreNum;
    this.isLighton = iflighton;
}

public void startEngine(){
System.out.println("Unknown Vehicle engine started");
}


}
