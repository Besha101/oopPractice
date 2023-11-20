package Midterm.streamsTask3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example usage
        List<Song> songs = List.of(
                new Song("Shape of You", "Ed Sheeran", Genre.POP, 243),
                new Song("Bohemian Rhapsody", "Queen", Genre.ROCK, 355),
                new Song("Sicko Mode", "Travis Scott", Genre.HIP_HOP, 312)
        );

        MusicPlaylist musicPlaylist = new MusicPlaylist(songs);

        // Test getAllSongs method
        System.out.println("All Songs:");
        musicPlaylist.getAllSongs().forEach(song -> System.out.println(song.title()));

        // Test getSongByTitle method
        String targetTitle = "Bohemian Rhapsody";
        System.out.println("\nSong by title '" + targetTitle + "':");
        musicPlaylist.getSongByTitle(targetTitle).ifPresent(song -> System.out.println(song));

        // Test getSongsByArtist method
        String targetArtist = "Ed Sheeran";
        System.out.println("\nSongs by artist " + targetArtist + ":");
        musicPlaylist.getSongsByArtist(targetArtist).forEach(song -> System.out.println(song.title()));

        // Test getSongsByGenre method
        Genre targetGenre = Genre.HIP_HOP;
        System.out.println("\nSongs in the " + targetGenre + " genre:");
        musicPlaylist.getSongsByGenre(targetGenre).forEach(song -> System.out.println(song.title()));

        // Test getTotalDuration method
        int totalDuration = musicPlaylist.getTotalDuration();
        System.out.println("\nTotal Duration of Playlist: " + totalDuration + " minutes");
    }
}

