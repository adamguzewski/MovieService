package adaguz.movieservice.service;

import adaguz.movieservice.model.Category;
import adaguz.movieservice.model.CountryOfProduction;
import adaguz.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    Movie movie1 = new Movie(1L, "The Dark Knight Rises", Category.ScienceFiction,
            CountryOfProduction.USA, "Christopher Nolan", 2012);
    Movie movie2 = new Movie(2L, "Die Hard", Category.Action,
            CountryOfProduction.USA, "John McTiernan", 1988);
    Movie movie3 = new Movie(3L, "Die Hard 2", Category.Action,
            CountryOfProduction.USA, "John McTiernan", 1990);
    Movie movie4 = new Movie(4L, "Die Hard 3", Category.Action,
            CountryOfProduction.USA, "John McTiernan", 1995);


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
