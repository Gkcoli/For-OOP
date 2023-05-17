package ClassPack;

import java.util.ArrayList;
import java.util.Random;

public class Playlist {
    private ArrayList < Songs > songs;

    public Playlist(){
        songs = new ArrayList < Songs > ();
    }
    public void addSong(Songs song){
        songs.add(song);
    }
    public void removeSong(Songs song){
        songs.remove(song);
    }
    public ArrayList < Songs > getSongs() {
        return songs;
    }

    public void playRandomSong(){
        int size = songs.size();
        if(size == 0){
            System.out.println("No songs in your playlist.");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
    }
}

