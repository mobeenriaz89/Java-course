package com.mobeen;

public class Main {

    public static void main(String[] args) {
    
        
        System.out.println(calcFeetAndInchesToCentimeters(5,6));
        System.out.println(calcFeetAndInchesToCentimeters(6));
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = 0;
        if(inches>=0){
            feet = inches/12;
            return feet;
        }else{
            return -1;
        }


    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet >=0 && inches >=0 && inches <= 12){
             double centimeters = inches*2.54;
             return  centimeters;
        }else{
            return -1;
        }
    }
}
