package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<String> gotvalues = readValues();
        for(int i=0;i<gotvalues.size();i++){
            System.out.println(gotvalues.get(i));
        }*/

    Imyinterface characterInterface;

    characterInterface = new Player();
    storeValues(characterInterface);
    loadValues(characterInterface);

    characterInterface = new Monsters();
    storeValues(characterInterface);
    loadValues(characterInterface);
    }

    private static void storeValues(Imyinterface characterInterface) {
        ArrayList<String> returnedData = readValues();
        characterInterface.saveData(returnedData);
    }

    private static void loadValues(Imyinterface characterInterface) {
        ArrayList<String> saveData = characterInterface.loadData();
        for(int i=0;i<saveData.size();i++){
            System.out.println(saveData.get(i));
        }

    }


    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("ENter your choice:\n" +
                    "1-Enter value\n" +
                    "0-Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    String value =scanner.next();
                    values.add(value);
                    break;
            }
        }
        return values;
    }


}
