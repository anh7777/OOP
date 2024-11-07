public abstract class AbstractCountry {
    protected CountryData countryData;

    public AbstractCountry(CountryData countryData) {
        this.countryData = countryData;
    }

    public String getName() {
        return countryData.toString();
    }

    public abstract String getRegion();
}
