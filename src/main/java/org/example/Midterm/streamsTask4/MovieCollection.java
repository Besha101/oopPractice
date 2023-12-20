package org.example.Midterm.streamsTask4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieCollection {

    private List<Movie> movies;

    public MovieCollection(List<Movie> movies){
        this.movies=movies;
    }

    public List<Movie> getAllMovies(){
        return this.movies;
    }

    public Optional<Movie> getMovieByTitle(String title){
        return movies.stream().filter(movie->movie.title().equals(title)).findFirst();
    }

    public List<Movie> getMoviesByDirector(String director){
        return movies.stream().filter(movie->movie.director().equals(director)).toList();
    }

    public List<Movie> getMoviesByGenre(Genre genre){
        return movies.stream().filter(movie->movie.genre()==genre).toList();
    }

    public String getTotalDuration(){
        int totalDuration=movies.stream().mapToInt(Movie::durationInMinutes).sum();
        int hours=totalDuration/60;
        int minutes=totalDuration-(hours*60);

        return String.format("%02d:%02d",hours,minutes);
    }

    public Map<Genre, Double> getAverageDurationByGenre(){
        return movies.stream().collect(Collectors.groupingBy(Movie::genre,Collectors.averagingDouble(Movie::durationInMinutes)));
    }

    public Optional<Movie> getLongestMovie(){
        return movies.stream().max(Comparator.comparingInt(Movie::durationInMinutes));
    }


}
