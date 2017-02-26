package com.mobeen;

import java.util.*;

public class Main {


    static ArrayList<Album> AlbumsList = new ArrayList<>();

    public static void main(String[] args) {
        LinkedList<String> myPlaylist = new LinkedList<>();
        //createDummyAlbums();
        //addDummySongsToAlbums();
        AlbumsList.add(new Album("ummah"));
        addSongToAlbum("ummah","ball");
        addSongToAlbum("ummah","apple");
        addSongToAlbum("ummah","cat");

        //showAllSongsinAllAlbums();



       addnewSongToPlaylist(myPlaylist,"ball");
        addnewSongToPlaylist(myPlaylist,"cat");
        addnewSongToPlaylist(myPlaylist,"apple");


        printplaylist(myPlaylist);

        printMenu(myPlaylist);

    }

    private static void printMenu(LinkedList myPlaylist) {
        ListIterator stringlistIterator = myPlaylist.listIterator();
        System.out.println("Now playing:" + stringlistIterator.next());
        boolean directionForward = true;

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            System.out.println("Enter your choice:\n" +
                    "1-exit\n" +
                    "2-next song\n" +
                    "3-previous song\n" +
                    "4-replay song\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    exit = true;
                    break;
                case 2:
                    if(!directionForward){
                        if(stringlistIterator.hasNext())
                        {
                            stringlistIterator.next();
                        }
                        directionForward = true;

                    }
                    if(stringlistIterator.hasNext()){
                        System.out.println("Now playing:" + stringlistIterator.next());

                    }else{
                        System.out.println("end of playlist");

                    }
                    break;

                case 3:
                    if(directionForward){
                        if(stringlistIterator.hasPrevious())
                        {
                            stringlistIterator.previous();
                        }
                        directionForward = false;

                    }
                    if(stringlistIterator.hasPrevious()){
                        System.out.println("Now playing:" + stringlistIterator.previous());

                    }else{
                        System.out.println("start of playlist");

                    }
                    break;

                case 4:

                    if(directionForward) {
                        System.out.println("Now playing:" + stringlistIterator.previous());
                        stringlistIterator.next();
                    }else if(!directionForward){
                        System.out.println("Now playing:" + stringlistIterator.next());
                        stringlistIterator.previous();
                    }
                    break;

                case 5:
                    stringlistIterator.remove();
                    if(stringlistIterator.hasNext()) {
                        System.out.println("Now playing:" + stringlistIterator.next());
                    }else if(stringlistIterator.hasPrevious()){
                        System.out.println("Now playing:" + stringlistIterator.previous());

                    }else{
                        System.out.println("play list is empty");
                    }

            }
        }


    }

    private static void addnewSongToPlaylist(LinkedList myPlaylist,String songName) {
        if (addSongToPlaylist(myPlaylist, songName)) {
            System.out.println("Song " + songName + " added to playlist");
        } else {
            System.out.println("unable to add song");
        }
    }

    /*public static void playSong(String songName){
        int index = findSongIndex(songName);


    }

    private static int findSongIndex(String songName) {

    }*/

    private static void addSongToAlbum(String albumname,String songName) {
    int index = findAlbumIndex(albumname);
    if(index>=0){
        AlbumsList.get(index).addNewSongToAlbum(songName,5);
    }else{
        System.out.println("Album not found");
    }
    }

    public static int findAlbumIndex(String AlbumName){
        for(int i=0;i<AlbumsList.size();i++){
            if(AlbumsList.get(i).getAlbumName().equals(AlbumName)){
                return i;
            }
        }
        return -1;
    }


    private static void printplaylist(LinkedList<String> myPlaylist) {
        Iterator i = myPlaylist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    private static boolean addSongToPlaylist(LinkedList myplaylist,String songName) {
        for(int i =0; i<AlbumsList.size();i++){
            for(int j=0; j<AlbumsList.get(i).getSongsList().size();j++){
                if(AlbumsList.get(i).findSongInAlbum(songName)>=0){
                    ListIterator<String> stringListIterator = myplaylist.listIterator();
                    while(stringListIterator.hasNext()) {
                        int comparison = stringListIterator.next().compareTo(songName);
                        if (comparison == 0) {
                            System.out.println("This song already exists in the playlist");
                            return false;
                        } else if (comparison > 0) {
                            stringListIterator.previous();
                            stringListIterator.add(songName);
                            return true;
                        } else if (comparison < 0) {
                            //move to next song
                        }
                    }
                    stringListIterator.add(songName);

                    return true;

                }
            }
        }
        return false;
    }

    private static void showAllSongsinAllAlbums() {
        for(int i=0;i<AlbumsList.size();i++){
            System.out.println("album name:" + AlbumsList.get(i).getAlbumName());
            int size = AlbumsList.get(i).getSongsList().size();
            for(int j=0;j<AlbumsList.get(i).getSongsList().size(); j++){
                System.out.println("Song " + i + ":" + AlbumsList.get(i).getSongsList().get(j).getSongTitle()+"\n");
            }
        }


    }

    private static void addDummySongsToAlbums() {
        for(int i=0; i<AlbumsList.size(); i++){
            for(int j=0;j<10;j++){
                AlbumsList.get(i).addNewSongToAlbum(AlbumsList.get(i).getAlbumName() + "_song_" + j,5);

            }
        }

    }

    private static void createDummyAlbums() {
        AlbumsList.add(new Album("album1"));
        AlbumsList.add(new Album("album2"));
        AlbumsList.add(new Album("album3"));
        AlbumsList.add(new Album("album4"));
        AlbumsList.add(new Album("album5"));
        AlbumsList.add(new Album("album6"));

    }






}
