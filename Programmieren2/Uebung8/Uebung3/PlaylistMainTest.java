package Uebung8.Uebung3;

import java.time.Duration;

public class PlaylistMainTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);

        Duration duration = Duration.ofDays(2);

        Song song1 = new Song("1", "1", duration, 1);
        Song song2 = new Song("2", "2", duration, 2);
        Song song3 = new Song("3", "3", duration, 3);
        Song song4 = new Song("4", "4", duration, 4);
        Song song5 = song4;

        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        playlist.add(song4);

        playlist.suffle();

        System.out.println(playlist.equals(song5));
    }
}
