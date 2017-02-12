package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class Tv {
    String powerButton;
    RemoteControl remote;

    public Tv(String powerButton, RemoteControl remote) {
        this.powerButton = powerButton;
        this.remote = remote;
    }

    public void turnOnTv(){
        remote.pressPowerButton();
    }
}
