package adaguz.movieservice.controller;

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
    public ResponseEntity<List <Movie>> allMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @PostMapping("/movies")
    public ResponseEntity<List <Movie>> addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable Long id){
        return ResponseEntity.ok(movieService.updateMovie(movie, id));
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<List<Movie>> deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @PutMapping("/movies/returnmovie/{id}")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id){
        movieService.changeStatus(id);
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @PutMapping("/movies/rentmovie/{id}")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id){
        movieService.changeStatus(id);
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

//
//    @PostMapping("/movies")
//    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
//        return ResponseEntity.ok(movie);
//    }
//
//    @PutMapping("/movies/{id}")
//    public ResponseEntity<Movie> updateMovieById(@RequestBody Movie movie, @PathVariable long id) throws WrongInputDataException, MovieNotFoundException {
//        if (movieService.getMovieByID(id) == null) {
//            throw new RuntimeException(new MovieNotFoundException(id));
//        }
//        if (movie.getId() == id) {
//            return ResponseEntity.ok(movie);
//        } else throw new RuntimeException(new WrongInputDataException(id));
//    }
//
//    @DeleteMapping("/movies/{id}")
//    public ResponseEntity<Void> deleteMovieById(@PathVariable long id) throws MovieNotFoundException {
//        if (movieService.getMovieByID(id) == null) {
//            throw new RuntimeException(new MovieNotFoundException(id));
//        }
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//    }
}
