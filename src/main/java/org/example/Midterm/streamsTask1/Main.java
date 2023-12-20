package org.example.Midterm.streamsTask1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();

        // Test methods
        System.out.println("All Movies:");
        movieDatabase.getAllMovies().forEach(movie -> System.out.println(movie.title()));

        System.out.println("\nMovie by Title:");
        Optional<Movie> movieByTitle = movieDatabase.getByTitle("Inception");
        movieByTitle.ifPresent(movie -> System.out.println(movie.title()));

        System.out.println("\nRecent Movies:");
        movieDatabase.getRecentMovies().forEach(movie -> System.out.println(movie.title()));

        System.out.println("\nMovie Titles by Genre:");
        movieDatabase.getMovieTitlesByGenre(Genre.DRAMA).forEach(System.out::println);
    }
}
