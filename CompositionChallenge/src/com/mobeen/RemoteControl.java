package com.mobeen;

/**
 * Created by Mobeen on 2/11/2017.
 */
public class RemoteControl {
   private boolean switchState;
    private boolean turnOff;
    private boolean volumeUp;
    private  boolean volumeDownn;

    public RemoteControl(boolean switchState, boolean turnOff, boolean volumeUp, boolean volumeDownn) {
        this.switchState = switchState;
        this.turnOff = turnOff;
        this.volumeUp = volumeUp;
        this.volumeDownn = volumeDownn;
    }

    public void pressPowerButton(){

        switchState = changeCurrentState();
        System.out.println("Tv switch state: " + switchState);
    }

    private boolean changeCurrentState() {
        if(switchState){
            return false;
        }else{
            return true;
        }

    }
}
