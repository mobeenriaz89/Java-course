package com.mobeen;

public class Main {

    public static void main(String[] args) {

        for(int i=2; i<9; i++){
            System.out.println("interest for interest rate " + i + " is " + String.format("%.2f",calculateInterest(10000.0,i)));
        }


        for(int i=8; i>1; i--){
            System.out.println("interest for interest rate " + i + " is " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        int counter = 0;
        for(int j=1;j<50; j++ ){
            if(isPrime(j)){
                counter++;
                System.out.println("yes " + j + " is a prime number");
            }
            if(counter==10){
                break;
            }
        }

    }

    public static  boolean isPrime(int num){
        if(num==1){
            return false;
        }

        for(int i=2; i<num/2 ; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;

    }

    private static double calculateInterest(double amount, double interestRate) {
        return(amount* (interestRate/100));
    }


}
