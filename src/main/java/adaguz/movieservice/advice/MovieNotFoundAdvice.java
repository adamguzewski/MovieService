package adaguz.movieservice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieNotFoundAdvice {
    @ExceptionHandler(MovieNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String movieNotFoundHandler(MovieNotFoundException exception) {
        return exception.getMessage();
    }

    @ExceptionHandler(WrongInputDataException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String wrongInputDataHandler(WrongInputDataException exception){
        return exception.getMessage();
    }
}
