package adaguz.movieservice.model;

public class CountryOfProduction {
    private String country;
    private long countryId;

    public CountryOfProduction(String country, long countryId) {
        this.country = country;
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }
}
