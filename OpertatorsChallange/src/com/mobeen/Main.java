package com.mobeen;

public class Main {

    public static void main(String[] args) {
        double num1 = 20d;
        double num2 = 20d;
        double result = num1+num2;
        result = result*25;
        result = result%40;
        boolean isoverlimit = false;

        if(result<=20)
        {
            System.out.println("Total was over the limit");
        }else{
            System.out.println("Total was under the limit");
        }





    }
}
