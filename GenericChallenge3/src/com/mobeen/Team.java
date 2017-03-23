package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 3/23/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {

    String teamName;
    int won=0;
    int loss=0;
    int tied=0;
    int played=0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<T> getTeamsList() {
        return teamsList;
    }

    ArrayList<T> teamsList = new ArrayList<T>();

    public void addPlayerToTeam(T player){
        if(playerExist(player)){
            System.out.println(player.getPlayerName() + " already exist in the team");
        }else{
            teamsList.add(player);
            System.out.println(player.getPlayerName() + " added to the team");
        }

    }

    public boolean playerExist(T player){
        for(int i=0; i<teamsList.size(); i++){
            if(teamsList.get(i).getPlayerName() == player.getPlayerName()){
                return true;
            }
        }
        return false;
    }



    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message = null;
        played++;
        if(ourScore > theirScore){
            won++;
            message = " won by ";

        }else if(ourScore < theirScore){
            loss++;
            message = " lost from ";
        }else{
            tied++;
            message = " tied with ";
        }

        if(opponent != null){
            System.out.println(this.teamName + message + opponent.getTeamName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }


    public int ranking(){
        return (won *2) + tied;
    }


    @Override
    public int compareTo(Team<T> o) {
    if(this.ranking() > o.ranking()){
        return -1;
    }else if(this.ranking() < o.ranking()){
        return 1;
    }else{
        return 0;
    }
    }
}
