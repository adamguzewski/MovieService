package adaguz.movieservice.service;

import adaguz.movieservice.advice.MovieNotFoundAdvice;
import adaguz.movieservice.advice.MovieNotFoundException;
import adaguz.movieservice.model.Movie;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List <Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id){
        return movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }


}

