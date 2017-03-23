package com.mobeen;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Mobeen on 3/23/2017.
 */
public class League<T extends Team> {

    ArrayList<T> league = new ArrayList<T>();


    public boolean addTeam(T team){
        if(!league.contains(team)){
            league.add(team);
            return true;
        }else{
            return false;
        }
    }

    public void showleagueTable(){
        Collections.sort(league);
        for(T team: league) {
            System.out.println(team.getTeamName() + ": " + team.ranking());
        }
    }
}
