package com.mobeen;

/**
 * Created by Mobeen on 2/8/2017.
 */
public class Honda extends Car {
    private  String modelName;
    public Honda(int numOfTyre,int numOfGears, String modelName) {
        super(numOfTyre,numOfGears);
        this.modelName = modelName;
    }

    @Override
    public void handleSteering(){
        System.out.println("Honda handle steering called");
        move();
    }
    @Override
    public void changeGear(){
        System.out.println("Honda change gear called");
    }
   /* @Override
    public void move(){
        System.out.println("Honda move called");
    }*/
}
