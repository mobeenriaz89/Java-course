package com.mobeen;

public class Main {

    public static void main(String[] args) {
        CricketPlayer ShahidAfridi = new CricketPlayer("Shahid Afridi");
        CricketPlayer ShoaibAkhtar = new CricketPlayer("Shoaib Akhtar");

        CricketPlayer DHONI = new CricketPlayer("DHONI");
        CricketPlayer sachin = new CricketPlayer("sachin");

        FootballPlayer Ronaldo  = new FootballPlayer("Ronaldo");

        Team<CricketPlayer> CricketTeamPakistan = new Team<>("Pakistan");

        CricketTeamPakistan.addPlayerToTeam(ShahidAfridi);
        CricketTeamPakistan.addPlayerToTeam(ShoaibAkhtar);

        Team<CricketPlayer> CricketTeamIndia = new Team<>("India");

        CricketTeamIndia.addPlayerToTeam(DHONI);
        CricketTeamIndia.addPlayerToTeam(sachin);

        CricketTeamPakistan.matchResult(CricketTeamIndia,200,100);
        CricketTeamPakistan.matchResult(CricketTeamIndia,200,100);
        CricketTeamPakistan.matchResult(CricketTeamIndia,200,100);

        CricketTeamPakistan.matchResult(CricketTeamIndia,100,100);
        CricketTeamPakistan.matchResult(CricketTeamIndia,100,100);

        CricketTeamPakistan.matchResult(CricketTeamIndia,100,200);
        CricketTeamPakistan.matchResult(CricketTeamIndia,100,200);

        League<Team<CricketPlayer>> cricketLeage = new League<>("ipl");
        cricketLeage.addTeamToLeague(CricketTeamPakistan);
        cricketLeage.addTeamToLeague(CricketTeamIndia);
        cricketLeage.showleagueTable();

    }
}
