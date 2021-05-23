package adaguz.movieservice.model;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)

    @Column(name="countryofproduction")
    private CountryOfProduction countryOfProduction;
    private String direction;

    @Column(name="yearofproduction")
    private int yearOfProduction;

    public Movie(Long id, String name, Category category, CountryOfProduction countryOfProduction, String direction, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.countryOfProduction = countryOfProduction;
        this.direction = direction;
        this.yearOfProduction = yearOfProduction;
    }

    public Movie(String name, Category category, CountryOfProduction countryOfProduction, String direction, int yearOfProduction) {
        this.name = name;
        this.category = category;
        this.countryOfProduction = countryOfProduction;
        this.direction = direction;
        this.yearOfProduction = yearOfProduction;
    }

    public Movie(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CountryOfProduction getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(CountryOfProduction countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
