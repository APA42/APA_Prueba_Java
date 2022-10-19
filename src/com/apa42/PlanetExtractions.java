package com.apa42;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

public class PlanetExtractions {

    public List<String> printPlanetFacts(Planet planet, String country) {
        List<String> result = new ArrayList<>();
        result.add("Planet name is " + planet.getName());
        result.add("Current season is " + planet.getCountryWeather());
        result.add("Number of times the planet rotates around the sun is " + 365);
        result.add("Number of characters in planet name = " + planet.getName().length());
        switch (planet.getCountryWeather()) {
            case "Spring":
                result.add("The weather is warm in the UK");
                break;
            case "Summer":
                result.add("The weather is hot in the UK");
                break;
            case "Autumn":
                result.add("The weather is cool in the UK");
                break;
            default:
                result.add("The weather is cold in the UK");
                break;
        }

        return result;
    }
}
