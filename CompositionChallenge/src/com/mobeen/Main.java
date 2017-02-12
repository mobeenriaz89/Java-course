package com.mobeen;

public class Main {

    public static void main(String[] args) {
        Furniture mybrandnewfurniture = new Furniture("computer table","double bed",new Dressing("mirror","holder"));
        WallClock myRoundWallclock = new WallClock("10","15","22");
        Tv mysonytv = new Tv("powerbutton",new RemoteControl(true,false,false,false));
        Room myroom = new Room(mybrandnewfurniture,myRoundWallclock,mysonytv);

        myroom.AccessTv();

        myroom.getMyTv().turnOnTv();

    }
}
