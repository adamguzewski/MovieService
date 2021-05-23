package adaguz.movieservice.service;

import adaguz.movieservice.model.Category;
import adaguz.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    Movie movie1 = new Movie(1, "The Dark Knight Rises", new Category("Sci-Fi", 4),
            "USA", "Christopher Nolan", 2012);
    Movie movie2 = new Movie(2, "Die Hard", new Category("Action", 1),
            "USA", "John McTiernan", 1988);
    Movie movie3 = new Movie(3, "Die Hard 2", new Category("Action", 1),
            "USA", "John McTiernan", 1990);
    Movie movie4 = new Movie(4, "Die Hard 3", new Category("Action", 1),
            "USA", "John McTiernan", 1995);


    public List<Movie> getAllMovies() {
        return List.of(movie1, movie2, movie3, movie4);
    }

    public Movie getMovieByID(long id) {
        for (Movie movie : getAllMovies()) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}
