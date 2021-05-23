package adaguz.movieservice.advice;

public class WrongInputDataException extends RuntimeException {
    public WrongInputDataException(long id){
        super("Wrong input data. Bad ID: " + id);
    }
}
