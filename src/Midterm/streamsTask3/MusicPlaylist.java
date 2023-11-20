package Midterm.streamsTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusicPlaylist {

    private List<Song> songs;

    public MusicPlaylist(List<Song> songs){
        this.songs=songs;
    }

    public List<Song> getAllSongs(){
        return this.songs;
    }

    public Optional<Song> getSongByTitle(String title){
        return songs.stream().filter(song->song.title().equals(title)).findFirst();
    }

    public List<Song> getSongsByArtist(String artist){
        return songs.stream().filter(song->song.artist().equals(artist)).toList();
    }

    public List<Song> getSongsByGenre(Genre genre){
        return songs.stream().filter(song->song.genre()==genre).toList();
    }

    public int getTotalDuration(){
        return songs.stream().mapToInt(Song::durationInSeconds).sum()/60;

    }

}
