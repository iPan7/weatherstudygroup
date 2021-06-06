package models;

import java.util.Objects;

public class Condition {
    private double windSpeed;
    private Temperature temperature;
    private String windDirection;
    private String skies;
    private String precipitation;

    public Condition(double windSpeed, Temperature temperature, String windDirection, String skies, String precipitation) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.windDirection = windDirection;
        this.skies = skies;
        this.precipitation = precipitation;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getSkies() {
        return skies;
    }

    public void setSkies(String skies) {
        this.skies = skies;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition condition = (Condition) o;
        return Double.compare(condition.windSpeed, windSpeed) == 0 && Objects.equals(temperature, condition.temperature) && Objects.equals(windDirection, condition.windDirection) && Objects.equals(skies, condition.skies) && Objects.equals(precipitation, condition.precipitation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windSpeed, temperature, windDirection, skies, precipitation);
    }

    @Override
    public String toString() {
        return "Condition{" +
                "windSpeed=" + windSpeed +
                ", temperature=" + temperature +
                ", windDirection='" + windDirection + '\'' +
                ", skies='" + skies + '\'' +
                ", precipitation='" + precipitation + '\'' +
                '}';
    }
}
