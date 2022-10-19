package com.apa42;

public class PlanetBuilder {
    private String planetName;
    private String season;
    private String realSeason;

    public PlanetBuilder setPlanetName(String planetName) {
        this.planetName = planetName;
        return this;
    }

    public PlanetBuilder setSeason(String season) {
        this.season = season;
        return this;
    }

    public PlanetBuilder setRealSeason(String realSeason) {
        this.realSeason = realSeason;
        return this;
    }

    public Planet createPlanet() {
        return new Planet(planetName, season, realSeason);
    }
}