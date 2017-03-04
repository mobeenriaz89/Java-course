package com.mobeen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Player player = new Player("mobeen",4,100);
        System.out.println(player);
        saveplayerdata(player);
        //loadplayerData(player);
        System.out.println(player);
        saveplayerdata(player);
        ISaveable monster = new Monster("muzamil",100,333);
        System.out.println(((Monster) monster).getStrength());
        System.out.println(monster);
        saveplayerdata(monster);


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

   static void saveplayerdata(ISaveable player){
    for(int i=0; i<player.write().size();i++){
        System.out.println("saving "+ player.write().get(i));
       }
    }

    static void loadplayerData(ISaveable player){
       ArrayList<String> values = readValues();
       player.read(values);
    }
}
