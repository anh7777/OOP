import java.util.ArrayList;
import java.util.List;

public class CountryListManager {
    private static CountryListManager instance;
    private List<AbstractCountry> countries;

    private CountryListManager() {
        countries = new ArrayList<>();
    }

    public static CountryListManager getInstance() {
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public void addCountry(AbstractCountry country) {
        countries.add(country);
    }

    public void displayCountries() {
        for (AbstractCountry country : countries) {
            System.out.println(country.getName());
        }
    }
}
