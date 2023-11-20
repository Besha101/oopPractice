package Midterm.streamsTask1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieDatabase {
    private List<Movie> movies;

    public MovieDatabase() {
        movies = Arrays.asList(
                new Movie("Inception", Genre.SCIFI, 2010),
                new Movie("The Shawshank Redemption", Genre.DRAMA, 1994),
                new Movie("The Dark Knight", Genre.ACTION, 2008),
                new Movie("Forrest Gump", Genre.COMEDY, 1994),
                new Movie("Pulp Fiction", Genre.DRAMA, 1994)
        );


    }

    public List<Movie> getAllMovies(){
        return this.movies;
    }


    public Optional<Movie> getByTitle(String title){

        return movies.stream().filter(movie -> movie.title().equals(title)).findFirst();
    }

    public void getByGenre(Genre genre){
        List<String> movieTitles=movies.stream().filter(movie-> movie.genre()==genre).map(Movie::title).collect(Collectors.toList());

        movieTitles.forEach(System.out::println);
    }

    public List<Movie> getRecentMovies(){
        int currentYear=2012;
        return movies.stream().filter(movie->currentYear-movie.releaseYear()<=5).toList();
    }

    public List<String> getMovieTitlesByGenre(Genre genre){
        return movies.stream().filter(movie->movie.genre()==genre).map(Movie::title).toList();
    }




}
