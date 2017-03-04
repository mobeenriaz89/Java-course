package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 3/1/2017.
 */
public class Player implements Imyinterface {



    ArrayList<String> playerdata = new ArrayList<>();
    @Override
    public ArrayList<String> loadData() {
    return this.playerdata;

    }

    @Override
    public void saveData(ArrayList<String> saveData) {
       this.playerdata = saveData;
    }
}
