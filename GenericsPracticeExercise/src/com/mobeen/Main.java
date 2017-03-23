package com.mobeen;

public class Main {

    public static void main(String[] args) {


        CricketPlayer shahidAfridi = new CricketPlayer("Shahid Afridi");

        Team<CricketPlayer> teamPakistan = new Team<>("Pakistan");
        teamPakistan.addPlayer(shahidAfridi);

        Team<CricketPlayer> teamIndia = new Team<>("India");
        teamIndia.addPlayer(new CricketPlayer("Dhoni"));
       teamPakistan.matchResult(teamIndia,150,100);

        System.out.println( teamIndia.compareTo(teamPakistan));
    }
}
