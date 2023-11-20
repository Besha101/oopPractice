package Midterm.streamsTask4;

import java.util.List;
import java.util.Optional;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Example usage
        List<Movie> movies = List.of(
                new Movie("Inception", "Christopher Nolan", Genre.SCIFI, 148),
                new Movie("The Shawshank Redemption", "Frank Darabont", Genre.DRAMA, 142),
                new Movie("The Dark Knight", "Christopher Nolan", Genre.ACTION, 152),
                new Movie("Pulp Fiction", "Quentin Tarantino", Genre.COMEDY, 154),
                new Movie("Forrest Gump", "Robert Zemeckis", Genre.DRAMA, 142)
        );

        MovieCollection movieCollection = new MovieCollection(movies);

        // Test getAllMovies method
        System.out.println("All Movies:");
        movieCollection.getAllMovies().forEach(movie -> System.out.println(movie.title()));

        // Test getMovieByTitle method
        String targetTitle = "Inception";
        System.out.println("\nMovie by title '" + targetTitle + "':");
        Optional<Movie> movieByTitle = movieCollection.getMovieByTitle(targetTitle);
        movieByTitle.ifPresent(movie -> System.out.println(movie));

        // Test getMoviesByDirector method
        String targetDirector = "Christopher Nolan";
        System.out.println("\nMovies by director " + targetDirector + ":");
        List<Movie> moviesByDirector = movieCollection.getMoviesByDirector(targetDirector);
        moviesByDirector.forEach(movie -> System.out.println(movie.title()));

        // Test getMoviesByGenre method
        Genre targetGenre = Genre.DRAMA;
        System.out.println("\nMovies in the " + targetGenre + " genre:");
        List<Movie> moviesByGenre = movieCollection.getMoviesByGenre(targetGenre);
        moviesByGenre.forEach(movie -> System.out.println(movie.title()));

        // Test getTotalDuration method
        String totalDuration = movieCollection.getTotalDuration();
        System.out.println("\nTotal Duration of Movies: " + totalDuration);

        // Test getAverageDurationByGenre method
        System.out.println("\nAverage Duration by Genre:");
        Map<Genre, Double> averageDurationByGenre = movieCollection.getAverageDurationByGenre();
        averageDurationByGenre.forEach((genre, averageDuration) ->
                System.out.println(genre + ": " + averageDuration + " minutes"));

        // Test getLongestMovie method
        System.out.println("\nLongest Movie:");
        Optional<Movie> longestMovie = movieCollection.getLongestMovie();
        longestMovie.ifPresent(movie -> System.out.println(movie.title()));
    }
}
