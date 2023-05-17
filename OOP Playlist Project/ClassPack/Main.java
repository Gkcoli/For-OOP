package ClassPack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        
        playlist.addSong(new Songs("We Are Never Ever Getting Back Together", "Taylor Swift"));
        playlist.addSong(new Songs("Living If It's Not With You?", "The 1975"));
        playlist.addSong(new Songs("Making Love Out Of Nothing At All ", "Air Supply"));
        playlist.addSong(new Songs("As It Was", "Harry Styles"));
        playlist.addSong(new Songs("Stairway to Heaven", "Led Zeppelin"));
        playlist.addSong(new Songs("Bohemian Rhapsody", "Queen"));
        playlist.addSong(new Songs("Always", "Bon Jovi"));

        System.out.println("My Playlist:");
        for(Songs songs: playlist.getSongs()){
            System.out.println(songs.getTitle() + " by " + songs.getArtist());
       }
       System.out.println("\n**Playing Random Song At Your Playlist**");
       playlist.playRandomSong();
       System.out.println();
    //    playlist.playRandomSong();
    //    System.out.println();
    //    playlist.playRandomSong();
    //    System.out.println();

    }
    
}
