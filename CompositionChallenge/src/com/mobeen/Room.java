package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Room {

    Furniture myFurniture;
    WallClock myWallclock;
    Tv myTv;

    public Room(Furniture myFurniture, WallClock myWallclock, Tv myTv) {
        this.myFurniture = myFurniture;
        this.myWallclock = myWallclock;
        this.myTv = myTv;
    }

    public Furniture getMyFurniture() {
        return myFurniture;
    }

    public WallClock getMyWallclock() {
        return myWallclock;
    }

    public Tv getMyTv() {
        return myTv;
    }

    public void AccessTv(){
        myTv.turnOnTv();

    }
}
