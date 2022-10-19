package com.apa42;

public class Planet {
    private String name;
    private String season;
    private String realSeason;

    public Planet(String planetName, String season, String realSeason) {
        this.name = planetName;
        this.season = season;
        this.realSeason = realSeason;
    }

    public String getName() {
        return name;
    }

    public String getCountryWeather() {
        return realSeason;
    }
}
