package com.mobeen;

public class Main {

    public static void main(String[] args) {
        int num = 5;
        int finishnumber = 21;
        int evenCount = 0;
        while (num<=finishnumber) {
            if (!isEvenNumber(num)) {
            num++;
            continue;
            }
            System.out.println("yes " + num + " is an even number");
            num++;
            evenCount++;
            if(evenCount>=5){
                break;
            }

        }
        System.out.println("Even number count is " + evenCount);

    }

    private static boolean isEvenNumber(int num) {
        if(num%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
