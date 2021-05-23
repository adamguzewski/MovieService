package adaguz.movieservice.model;

public class Movie {

    private long id;
    private String name;
    private Category category;
    private String countryOfProduction;
    private String direction;
    private int yearOfProduction;

    public Movie(long id, String name, Category category, String countryOfProduction, String direction, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.countryOfProduction = countryOfProduction;
        this.direction = direction;
        this.yearOfProduction = yearOfProduction;
    }

    public Movie(String name, Category category, String countryOfProduction, String direction, int yearOfProduction) {
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

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
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
