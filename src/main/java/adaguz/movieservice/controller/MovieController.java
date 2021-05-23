package adaguz.movieservice.controller;

import adaguz.movieservice.advice.MovieNotFoundException;
import adaguz.movieservice.advice.WrongInputDataException;
import adaguz.movieservice.model.Movie;
import adaguz.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()

public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> allMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieByID(@PathVariable long id) throws MovieNotFoundException {
        if (movieService.getMovieByID(id) == null) {
            throw new RuntimeException(new MovieNotFoundException(id));
        }
        return ResponseEntity.ok(movieService.getMovieByID(id));
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovieById(@RequestBody Movie movie, @PathVariable long id) throws WrongInputDataException, MovieNotFoundException {
        if (movieService.getMovieByID(id) == null) {
            throw new RuntimeException(new MovieNotFoundException(id));
        }
        if (movie.getId() == id) {
            return ResponseEntity.ok(movie);
        } else throw new RuntimeException(new WrongInputDataException(id));
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable long id) throws MovieNotFoundException{
        if(movieService.getMovieByID(id) == null){
            throw new RuntimeException(new MovieNotFoundException(id));
        }
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }
}
