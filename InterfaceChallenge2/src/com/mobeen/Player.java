package com.mobeen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobeen on 3/2/2017.
 */
public class Player implements ISaveable{
    String name;
    int hitpoints;
    int strength;
    String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> saveValues) {
        this.name = saveValues.get(0);
        this.hitpoints = Integer.parseInt(saveValues.get(1));
    }

    @Override
    public List<String> write() {
        ArrayList<String> playerdata = new ArrayList<>();
        playerdata.add(0,"" + this.name);
        playerdata.add(1,"" + this.hitpoints);
        playerdata.add(2,"" + this.strength);
        return  playerdata;
    }
}
