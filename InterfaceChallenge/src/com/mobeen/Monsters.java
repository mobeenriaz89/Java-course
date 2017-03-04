package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 3/1/2017.
 */
public class Monsters implements Imyinterface {


    ArrayList<String> monsterData = new ArrayList<>();
    @Override
    public ArrayList<String> loadData() {

        return this.monsterData;
    }

    @Override
    public void saveData(ArrayList<String> saveData) {
        this.monsterData = saveData;
    }
}
