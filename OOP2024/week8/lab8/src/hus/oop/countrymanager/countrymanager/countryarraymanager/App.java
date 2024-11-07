package hus.oop.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        /* TODO: write code to test program */
        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */
                Country newCountry = null;
                switch (dataList.get(5)) {
                    case "Africa" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new AfricaCountry(code, name, population, area, gdp);
                    }
                    case "Asia" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new AsiaCountry(code, name, population, area, gdp);
                    }
                    case "Oceania" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new OceaniaCountry(code, name, population, area, gdp);
                    }
                    case "Europe" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new EuropeCountry(code, name, population, area, gdp);
                    }
                    case "North America" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new NorthAmericaCountry(code, name, population, area, gdp);
                    }
                    case "South America" -> {
                        String code = dataList.get(0);
                        String name = dataList.get(1);
                        int population = Integer.parseInt(dataList.get(2));
                        double area = Double.parseDouble(dataList.get(3));
                        double gdp = Double.parseDouble(dataList.get(4));
                        newCountry = new SouthAmericaCountry(code, name, population, area, gdp);
                    }
                }

                if (newCountry != null) {
                    countryManager.append(newCountry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }
        
        return result;
    }

//    public static String[] parseDataLineToArray(String dataLine) {
//        if (dataLine == null) {
//            return null;
//        }
//
//        return dataLine.split(COMMA_DELIMITER);
//    }

    public static void init() {
        String filePath = "D:\\University\\Program\\OOP2024\\week9\\countrymanager\\countrymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
        System.out.println();
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);

    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        AfricaCountry[] africaCountries = countryManager.filterAfricaCountry();
        System.out.println("Africa Countries:");
        for (AfricaCountry country : africaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        AsiaCountry[] asiaCountries = countryManager.filterAsiaCountry();
        System.out.println("Asia Countries:");
        for (AsiaCountry country : asiaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        EuropeCountry[] europeCountries = countryManager.filterEuropeCountry();
        System.out.println("Europe Countries:");
        for (EuropeCountry country : europeCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] northAmericaCountries = countryManager.filterNorthAmericaCountry();
        System.out.println("North America Countries:");
        for (NorthAmericaCountry country : northAmericaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        OceaniaCountry[] oceaniaCountries = countryManager.filterOceaniaCountry();
        System.out.println("Oceania Countries:");
        for (OceaniaCountry country : oceaniaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] southAmericaCountries = countryManager.filterSouthAmericaCountry();
        System.out.println("South America Countries:");
        for (SouthAmericaCountry country : southAmericaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        int howMany = 1;
        Country[] mostPopulousCountries = countryManager.filterMostPopulousCountries(howMany);
        System.out.println("Most populous countries:");
        for (Country country : mostPopulousCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        int howMany = 5;
        Country[] leastPopulousCountries = countryManager.filterLeastPopulousCountries(howMany);
        System.out.println("Least populous countries:");
        for (Country country : leastPopulousCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        int howMany = 5;
        Country[] largestAreaCountries = countryManager.filterLargestAreaCountries(howMany);
        System.out.println("Largest area countries:");
        for (Country country : largestAreaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        int howMany = 5;
        Country[] smallestAreaCountries = countryManager.filterSmallestAreaCountries(howMany);
        System.out.println("Smallest area countries:");
        for (Country country : smallestAreaCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        int howMany = 5;
        Country[] highestGdpCountries = countryManager.filterHighestGdpCountries(howMany);
        System.out.println("Highest GDP countries:");
        for (Country country : highestGdpCountries) {
            System.out.println(country.getName());
        }
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        int howMany = 5;
        Country[] lowestGdpCountries = countryManager.filterLowestGdpCountries(howMany);
        System.out.println("Lowest GDP countries:");
        for (Country country : lowestGdpCountries) {
            System.out.println(country.getName());
        }
    }
}
