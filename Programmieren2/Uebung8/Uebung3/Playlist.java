package Uebung8.Uebung3;

import Uebung8.Uebung1.FolgeAlsDynArray;

import java.util.Random;

public class Playlist {
    FolgeAlsDynArray<Song> playlist;

    public Playlist(int size) {
        playlist = new FolgeAlsDynArray<>(size);
    }

    void add(Song song) {
        playlist.addLast(song);
    }

    void delete(Song song) {
        playlist.delete(song);
    }

    void play() {
        System.out.println(playlist);
    }

    void play(Song song) {
        System.out.println(song);
    }

    void suffle () {
        Random random = new Random();

        FolgeAlsDynArray<Song> newtmp = new FolgeAlsDynArray<>(playlist.size());

        int size = playlist.size();
        for (int i = 0; i < size; i++) {
            int rando = random.nextInt(playlist.size());
            System.out.println(playlist.get(rando));
            newtmp.addLast(playlist.get(rando));
            playlist.remove(rando);
        }
        playlist = newtmp;
    }

    public boolean equals(Object o) {
        //ka ob man hier eine Playlist vergleichen soll oder songs
        Song song = (Song) o;
        for (Song tmp : playlist) {
            if(tmp == song)
                return true;
        }
        return false;
    }
}
