package hus.oop.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[minIndex];
                newArray[minIndex] = temp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[maxIndex];
                newArray[maxIndex] = temp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
//        int i, j, temp;
//        boolean swapped;
//        for (i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap arr[j] and arr[j+1]
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            // If no two elements were
//            // swapped by inner loop, then break
//            if (swapped == false)
//                break;
//        }
        boolean swapped;
        for (int i = 0; i < newArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        boolean swapped;
        for (int i = 0; i < newArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country temp = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > temp.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = temp;
        }
        return newArray;
    }


    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country temp = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < temp.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = temp;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> africaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }
        return africaCountries.toArray(new AfricaCountry[0]);
    }


    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> asiaCountries = new ArrayList<>();
        try (Stream<Country> countryStream = Stream.of(countries)) {
            countryStream
                    .filter(country -> country instanceof AsiaCountry)
                    .map(country -> (AsiaCountry) country)
                    .forEach(asiaCountries::add);
        }
        return asiaCountries.toArray(new AsiaCountry[0]);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> europeCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        return europeCountries.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        return northAmericaCountries.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        return oceaniaCountries.toArray(new OceaniaCountry[0]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        return southAmericaCountries.toArray(new SouthAmericaCountry[0]);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }
        Country[] sortedCountries = sortByDecreasingPopulation();
        return Arrays.copyOf(sortedCountries, howMany);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }
        Country[] sortedCountries = sortByIncreasingPopulation();
        return Arrays.copyOf(sortedCountries, howMany);
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }

        Country[] sortedCountries = sortByDecreasingArea();

        return Arrays.copyOf(sortedCountries, howMany);
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }
        Country[] sortedCountries = sortByIncreasingArea();
        return Arrays.copyOf(sortedCountries, howMany);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }
        Country[] sortedCountries = sortByDecreasingGdp();
        return Arrays.copyOf(sortedCountries, howMany);
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        if (howMany <= 0 || howMany > length) {
            throw new IllegalArgumentException("Invalid 'howMany' parameter");
        }
        Country[] sortedCountries = sortByIncreasingGdp();
        return Arrays.copyOf(sortedCountries, howMany);
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
