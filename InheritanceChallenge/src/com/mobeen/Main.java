package com.mobeen;

public class Main {

    public static void main(String[] args) {
    Vehicle v = new Vehicle(0);
    v.handleSteering();
    v.move();
    v.changeGear();

        Car c = new Car(4,4);
        c.handleSteering();
        c.move();
        c.changeGear();

        Honda h = new Honda(4,4,"city");
        h.handleSteering();
        h.move();
        h.changeGear();
    }
}
