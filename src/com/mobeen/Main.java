package com.mobeen;

public class Main {

    public static void main(String[] args) {

        String PlayerName;
        int score = 100;
        int position = calculateHighScorePosition(score);
        PlayerName = "Mobeen";
        displayHighScorePosition(PlayerName,position);

    }

    private static int calculateHighScorePosition(int score) {
      int position;
        if(score>1000){
          position = 1;
      }else if(score >500 && score <1000){
          position = 2;
      }else if(score >100 && score <500){
          position = 3;
      }else{
          position = 4;
        }
        return position;

    }

    private static void displayHighScorePosition(String pname,int pos) {
        System.out.println(pname + "managed to get in to position" + pos + "on the high score table");
    }
}
