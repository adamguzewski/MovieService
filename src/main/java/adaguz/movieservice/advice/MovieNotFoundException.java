package adaguz.movieservice.advice;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(long id){
        super("Could not find movie with id: " + id);
    }
}
