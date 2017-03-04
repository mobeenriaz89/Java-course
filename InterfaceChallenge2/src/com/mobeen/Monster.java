package com.mobeen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobeen on 3/2/2017.
 */
public class Monster implements ISaveable {
    String name;
    int hitpoints;
    int strength;


    public Monster(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;

    }

    public String getName() {
        return name;
    }



    public int getHitpoints() {
        return hitpoints;
    }



    public int getStrength() {
        return strength;
    }




    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                 '\'' +
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
