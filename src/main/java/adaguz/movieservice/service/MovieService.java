package adaguz.movieservice.service;

import adaguz.movieservice.advice.MovieNotFoundException;
import adaguz.movieservice.model.Movie;
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

    public Movie updateMovie(Movie movie, Long id){
        Movie movieToUpdate;
        movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
        movieToUpdate = movie;
        movieToUpdate.setId(id);
        return movieRepository.save(movieToUpdate);
    }

    public void deleteMovie(Long id){
        Movie movie = movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
        movieRepository.delete(movie);
    }

    public void makeTrue(Long id){
        Movie movie = movieRepository.findById(id).orElseThrow(MovieNotFoundException::new);
        movie.setAvailable(true);
        movieRepository.save(movie);
    }


}

