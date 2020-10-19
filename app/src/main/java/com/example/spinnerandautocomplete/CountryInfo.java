package com.example.spinnerandautocomplete;

public class CountryInfo
{
    private int countryFlag;
    private long countryPopulation;
    private String countryName;

    public CountryInfo(int countryFlag, long countryPopulation, String countryName) {
        this.countryFlag = countryFlag;
        this.countryPopulation = countryPopulation;
        this.countryName = countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public long getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountryName() {
        return countryName;
    }
}
