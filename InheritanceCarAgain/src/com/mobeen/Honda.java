package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Honda extends Car {

    private String modelName;

    public Honda(String modelName) {
        super(4, 1300, true, 44);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void getCarDetails(String model){
        if(model==this.modelName){
            System.out.println("Car name is Honda \n Its model name is:" +
            this.modelName + "\n Its engine size is  " + getEngine() +
            "cc\n it has " + getWheels() + " wheels");
        }

    }
    @Override
    public void move(){
        accelerate();
        super.accelerate();
        System.out.println(modelName + " moving");

    }



    public void accelerate(){
        System.out.println(modelName + " accelerating");

    }






}
