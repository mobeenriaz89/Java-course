package com.mobeen;

public class Main {

    public static void main(String[] args) {
        Team<CricketPlayer> cricketTeamPakistan = new Team("Pakistan");
        Team<CricketPlayer> cricketTeamIndia = new Team("India");

        Team<FootballPlayer> footballTeam = new Team("Brazil");

        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        CricketPlayer shahidAfridi = new CricketPlayer("Shahid Afridi");
        cricketTeamPakistan.addPlayerToTeam(shahidAfridi);


        for(int i=0; i< cricketTeamPakistan.playersList.size(); i++){
            System.out.println(cricketTeamPakistan.playersList.get(i).getPlayerName());
        }

        cricketTeamPakistan.matchresults(cricketTeamIndia,200,100);
        cricketTeamIndia.matchresults(cricketTeamPakistan,200,100);
        cricketTeamIndia.matchresults(cricketTeamPakistan,200,100);
        cricketTeamIndia.matchresults(cricketTeamPakistan,200,100);


        League<Team<CricketPlayer>> cricket = new League<>();
        cricket.addTeam(cricketTeamPakistan);
        cricket.addTeam(cricketTeamIndia);
        cricket.showleagueTable();

        }



}
