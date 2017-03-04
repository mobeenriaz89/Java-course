package com.mobeen;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Mobeen on 2/25/2017.
 */
public class Album {

    String albumName;
    SongList songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new SongList();
    }





    public String getAlbumName() {
        return albumName;
    }


    public boolean addNewSongToAlbum(String songName, int duration) {
       return this.songs.addSong(new Song(songName,duration));

    }

    public boolean addToPlaylist(String songName, LinkedList<Song> playlist){
        Song checkedSong = this.songs.findSong(songName);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("this song is not in the Album");
        return false;
    }

    private class SongList{


        ArrayList<Song> innersongslist;

        public SongList() {
            this.innersongslist = new ArrayList<>();
        }



        boolean addSong(Song song){
            if(this.innersongslist.contains(song)){
                return false;
            }else{
                this.innersongslist.add(song);
                return true;
            }
        }

        Song findSong(String songTitle){
        for(Song checkedSong: this.innersongslist){
            if(checkedSong.getSongTitle().equals(songTitle)){
                return checkedSong;
            }
        }
            return null;
        }




    }
}
