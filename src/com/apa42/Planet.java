package com.apa42;

public class Planet {
    private String name;
    private String season;

    public Planet(String planetName, String season) {
        this.name = planetName;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public String getCountryWeather() {
        return season;
    }
}
