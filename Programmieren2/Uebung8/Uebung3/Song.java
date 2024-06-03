package Uebung8.Uebung3;

import java.time.Duration;

public class Song {
    String titel;
    String interpreter;
    Duration length;
    int erscheinungsjahr;
    String songtext;

    public Song(String titel, String interpreter, Duration length, int erscheinungsjahr) {
        this.titel = titel;
        this.interpreter = interpreter;
        this.length = length;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public void setSongtext (String text) {
        this.songtext = text;
    }


    public String getTitel() {
        return titel;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public Duration getLength() {
        return length;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getSongtext() {
        return songtext;
    }

    public boolean equals(Object o) {
        Song tmp = (Song) o;
        return titel == tmp.titel && interpreter == tmp.interpreter && length == tmp.length && erscheinungsjahr == tmp.erscheinungsjahr;
    }

    @Override
    public String toString() {
        return titel + " " + interpreter + " " + titel + " " + length;
    }
}
