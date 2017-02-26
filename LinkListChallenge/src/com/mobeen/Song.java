package com.mobeen;

/**
 * Created by Mobeen on 2/25/2017.
 */
public class Song {

    private String songTitle;
    private int duration;

    public Song(String songTitle, int duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getDuration() {
        return duration;
    }



}
