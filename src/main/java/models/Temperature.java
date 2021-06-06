package models;

import java.util.Objects;

public class Temperature {
    private double fahrenheit;
    private double celsius;
    private int zipcode;

    public Temperature(double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public Temperature(double fahrenheit, double celsius, int zipcode) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.zipcode = zipcode;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.fahrenheit, fahrenheit) == 0 && Double.compare(that.celsius, celsius) == 0 && zipcode == that.zipcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fahrenheit, celsius, zipcode);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "fahrenheit=" + fahrenheit +
                ", celsius=" + celsius +
                ", zipcode=" + zipcode +
                '}';
    }
}
