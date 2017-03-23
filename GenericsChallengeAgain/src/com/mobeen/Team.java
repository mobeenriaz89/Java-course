package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 3/21/2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{

    String teamName;
    int won=0;
    int loss=0;
    int tied=0;
    int gamesplayed =0;

    ArrayList<T> playersList = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<T> getPlayersList() {
        return playersList;
    }

    public boolean addPlayerToTeam(T player){
        if(!exist(player)){
            playersList.add(player);
            return true;
        }else{
            return false;
        }
    }

    private boolean exist(T player) {
        for(int i=0; i<this.playersList.size(); i++){
            if(this.playersList.get(i).getPlayerName().equals(player.getPlayerName()))
                return  true;
        }
        return false;
    }

    public void matchresults(Team<T> opponent, int ourScore, int theirScore){

        String message  = null;
        gamesplayed++;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if( ourScore == theirScore){
            tied++;
            message = " tied ";
        }else if( ourScore < theirScore){
            loss++;
            message = " beat by ";
        }


        if(opponent != null){
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            matchresults(null, theirScore, ourScore);
        }


    }

    public int ranking(){

        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return  1;
        }else{
            return 0;
        }
    }
}
