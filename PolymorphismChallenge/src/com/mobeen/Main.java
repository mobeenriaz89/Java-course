package com.mobeen;

class Car{

    boolean engine;
    int cylinders;
    int wheels;
    String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "unknown vehicle engine started";
    }
    public String accelerate(){
        return "unknown vehicle accelerating";
    }
    public String brake(){
        return "unknown vehicle brake applied";
    }
}

class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName()+ " engine started";
    }
}

class Corolla extends Car{
    public Corolla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName()+ " engine started";
    }
}

class Suzuki extends Car{
    public Suzuki(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName()+ " engine started";
    }
}

class Audi extends Car{
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName()+ " engine started";
    }
}




public class Main {

    public static void main(String[] args) {

        for(int i=1; i<11 ; i++) {
            int randomnumber = (int) (Math.random() * 4) + 1;
            System.out.println("Random number:" + randomnumber);
            Car newCar = startCar(randomnumber);
            System.out.println(newCar.startEngine());
            }
        }

        public static Car startCar(int number){
            switch (number){
                case 1:
                    return new Honda(4,"city");
                case 2:
                    return new Suzuki(4,"ciaz");
                case 3:
                    return new Corolla(4,"xli");
                case 4:
                    return new Audi(4,"R8");
                case 5:
                    return new Honda(4,"civic");
            }
            return null;
    }


}
