package adaguz.movieservice.controller;

import adaguz.movieservice.advice.MovieNotFoundException;
import adaguz.movieservice.advice.WrongInputDataException;
import adaguz.movieservice.model.Movie;
import adaguz.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Movie> getMovieByID(@PathVariable long id){
        if (movieService.getMovieByID(id).getId() == id) {
            return ResponseEntity.ok(movieService.getMovieByID(id));
        } else throw new RuntimeException((new MovieNotFoundException(id)));

    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable int id) throws WrongInputDataException {
        if (movie.getId() == id) {
            return ResponseEntity.ok(movie);
        } else throw new RuntimeException(new WrongInputDataException(id));
    }
}
