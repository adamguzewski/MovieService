package adaguz.movieservice.advice;

import java.util.function.Supplier;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(){
        super("Could not find movie with id");
    }
}
