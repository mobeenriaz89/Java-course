package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Vehicle {

    int numoftyres;
    String color;
    int numofdoor;

    public Vehicle(int numoftyres, String color, int numofdoor){
        this.numoftyres = numoftyres;
        this.color = color;
        this.numofdoor = numofdoor;

    }

    public Vehicle(){
    this(100,"idk",1000);
    }

    public int getNumoftyres() {
        return numoftyres;
    }

    public String getColor() {
        return color;
    }

    public int getNumofdoor() {
        return numofdoor;
    }

    public void EngineStart(){
        System.out.println("Vehicle engine started");
    }


}
