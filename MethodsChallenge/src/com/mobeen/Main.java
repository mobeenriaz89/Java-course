package com.mobeen;

public class Main {


    public static void main(String[] args) {
        String playerName = "Mobeen";
        int score1 = 1500;
        int score2 = 900;

        int score3 = 400;

        int score4 = 50;

        int position = calculateHighScorePostion(score1);
        DisplayHighScorePosition(playerName,position);

         position = calculateHighScorePostion(score2);
        DisplayHighScorePosition("Ali",position);

         position = calculateHighScorePostion(score3);
        DisplayHighScorePosition("Naveed",position);

         position = calculateHighScorePostion(score4);
        DisplayHighScorePosition("Ubaid",position);
    }

    private static int calculateHighScorePostion(int score) {
        int position;
        if(score >1000){
            position = 1;
        }else if(score >500 && score < 1000){
    position = 2;
        }
        else if(score >100 && score < 500){
            position = 3;
        }else{
            position = 4;

        }
        return position;

    }

    private static void DisplayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on high score table");
    }
}
