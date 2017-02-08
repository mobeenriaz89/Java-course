package com.mobeen;

public class Main {

    public  static void main(String[] arg){
        Vehicle vehicle = new Vehicle();
        int num = vehicle.numofdoor;
        vehicle.EngineStart();

        Car car = new Car(4,"red",2);
        car.EngineStart();
    }

}
