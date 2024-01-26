package org.example.Final.Testing.Week10.aLabPractice.a4thTask;

public class Song {

    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "title: " + title +
                ", artist: " + artist +
                ", genre: " + genre ;
    }
}
