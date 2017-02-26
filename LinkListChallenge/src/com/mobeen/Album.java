package com.mobeen;

import java.util.ArrayList;

/**
 * Created by Mobeen on 2/25/2017.
 */
public class Album {

    String albumName;
    ArrayList<Song> songsList = new ArrayList<>();

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public String getAlbumName() {
        return albumName;
    }


    public boolean addNewSongToAlbum(String songName, int duration) {

        int index = findSongInAlbum(songName);
        if (index < 0) {
            this.songsList.add(new Song(songName, duration));
            return true;
        } else {
            return false;
        }
    }

    public int findSongInAlbum(String songName) {
        for (int i = 0; i < songsList.size(); i++) {
            if (this.songsList.get(i).getSongTitle().equals(songName)) {
                return i;
            }
        }
        return -1;

    }
}
