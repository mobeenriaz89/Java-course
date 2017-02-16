package com.mobeen;

import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    int[] numbers = new int[5];
    numbers = getInputfromuser(numbers);
    printArray(sortNumbers(numbers));

    }

    private static int[] sortNumbers(int[] numbers) {
        for(int i =0; i<numbers.length; i++){
            for(int j= 0; j<numbers.length ; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return  numbers;
    }

    private static void printArray(int[] numbers) {
        for(int i = 0 ; i<numbers.length; i++){

            System.out.println(numbers[i]);
        }
    }

    private static int[] getInputfromuser(int[] numbers) {

        int[] inputNumbers = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){
            inputNumbers[i] = scanner.nextInt();
        }
        return inputNumbers;
    }
}
