package adaguz.movieservice.service;

import adaguz.movieservice.model.Category;
import adaguz.movieservice.model.CountryOfProduction;
import adaguz.movieservice.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    Movie movie1 = new Movie(1, "The Dark Knight Rises", new Category("Sci-Fi", 4),
                new CountryOfProduction("USA", 2), "Christopher Nolan", 2012 );
    Movie movie2 = new Movie(2, "Die Hard", new Category("Action", 1),
                new CountryOfProduction("USA", 2), "John McTiernan", 1988 );
    public List<Movie> getAllMovies(){
        return List.of(movie1, movie2);
    }

    public Movie getMovieByID(long id){
        for (Movie movie : getAllMovies()) {
            if (movie.getId() == id) {
                return movie;
            }
        } return null;
    }
}
