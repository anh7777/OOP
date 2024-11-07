package com.countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {
    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
    }

    public void remove(int index) {
        /* TODO */
    }

    public void remove(AbstractCountry country) {
        /* TODO */
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        /* TODO */
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return 1;
                } else if (left.getArea() < right.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
        /* TODO */
    }

    public List<AbstractCountry> sortGdpIncreasing() {
        /* TODO */
    }

    public List<AbstractCountry> sortGdpDecreasing() {
        /* TODO */
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        /* TODO */
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        /* TODO */
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
