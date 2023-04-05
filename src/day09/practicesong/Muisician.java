package day09.practicesong;

import day04.array.StringList;

public class Muisician {

    private String name;
    public StringList songs;

    public Muisician() {
    }

    public Muisician(String name, StringList songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringList getSongs() {
        return songs;
    }

    public void setSongs(StringList songs) {
        this.songs = songs;
    }
}
