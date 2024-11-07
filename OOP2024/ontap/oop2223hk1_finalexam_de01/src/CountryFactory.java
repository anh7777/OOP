public class CountryFactory {
    private static CountryFactory instance;

    private CountryFactory() {}

    public static CountryFactory getInstance() {
        if (instance == null) {
            instance = new CountryFactory();
        }
        return instance;
    }

    public AbstractCountry createCountry(CountryData data) {
        switch (data.toString().toLowerCase()) {
            case "asia":
                return new AsiaCountry(data);
            // Add other cases for different regions
            default:
                return null;
        }
    }
}
