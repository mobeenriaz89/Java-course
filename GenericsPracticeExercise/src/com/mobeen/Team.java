package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 3/18/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    ArrayList<T> playersList = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if(playersList.contains(player)){
            System.out.println("Player " + player.getName() + " is already in this team");
            return false;
        }else{
            this.playersList.add(player);
            return true;
        }
    }

    public int numofPlayers(){
        return  this.playersList.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message = null;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " tied with ";
        }
        else{
            lost++;
            message =  " lost to " ;
        }
        played++;

        if(opponent != null){
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            matchResult(null, theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking() > o.ranking()) {
            return -1;
        }
            else if(this.ranking() < o.ranking()){
                return 0;
            }else{
                return 1;
        }
    }
}



