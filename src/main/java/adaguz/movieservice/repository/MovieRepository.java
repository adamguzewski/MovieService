package adaguz.movieservice.repository;

import adaguz.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Override
    <S extends Movie> S save(S entity);

    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long aLong);

    @Override
    void delete(Movie entity);
}
