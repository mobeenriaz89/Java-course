package com.mobeen;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Mobeen on 3/23/2017.
 */
public class League<T extends Team> {

    String leagueName;

    public League(String leagueName) {
        this.leagueName = leagueName;
    }
    ArrayList<T> leaguesList = new ArrayList<T>();


    public void addTeamToLeague(T team){
        if(!leaguesList.contains(team)){
            leaguesList.add(team);
            System.out.println("Team " + team.getTeamName() + " added to the league");
        }else{
            System.out.println(team.getTeamName() + " already exist in the league");
        }
    }

    public void showleagueTable(){
        Collections.sort(leaguesList);

        for(T team : leaguesList){
            System.out.println(team.getTeamName() + ": " + team.ranking());
        }
    }
}
