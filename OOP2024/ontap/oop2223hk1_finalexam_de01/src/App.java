import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        CountryListManager manager = CountryListManager.getInstance();
        CountryFactory factory = CountryFactory.getInstance();

        try (BufferedReader br = new BufferedReader(new FileReader("countries.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                CountryData data = new CountryData.Builder()
                        .setName(values[0])
                        .setPopulation(Integer.parseInt(values[1]))
                        .setArea(Double.parseDouble(values[2]))
                        .setGdp(Double.parseDouble(values[3]))
                        .setRegion(values[4])
                        .build();
                AbstractCountry country = factory.createCountry(data);
                manager.addCountry(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        manager.displayCountries();
    }
}
