package io.codelex.oop.cars;

import java.util.Objects;

public class Manufacturer {
    private final String name;
    private final int yearOfEstablishment;
    private final String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manufacturer: " +
                "name:'" + name + '\'' +
                ", yearOfEstablishment:" + yearOfEstablishment +
                ", country:'" + country + '\'';
    }
}
