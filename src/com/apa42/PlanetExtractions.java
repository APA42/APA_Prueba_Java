package com.apa42;

import java.util.ArrayList;
import java.util.List;

public class PlanetExtractions {

    public static final int NUMBER_OF_DAYS_IN_A_YEAR = 365;
    private static String theWeatherIs;

    public List<String> printPlanetFacts(Planet planet, String country) {
        int planetNameLength = planet.getName().length();
        List<String> result = new ArrayList<>();
        result.add("Planet name is " + planet.getName());
        result.add("Current season is " + planet.getCountryWeather());
        result.add("Number of times the planet rotates around the sun is " + NUMBER_OF_DAYS_IN_A_YEAR);
        result.add("Number of characters in planet name = " + planetNameLength);
        updateWithWeather(planet, result, "UK");

        return result;
    }

    private static void updateWithWeather(Planet planet, List<String> result, String country) {
        switch (planet.getCountryWeather()) {
            case "Spring":
                theWeatherIs = "The weather is";
                result.add(theWeatherIs + " warm in the " + country);
                break;
            case "Summer":
                result.add(theWeatherIs + " hot in the " + country);
                break;
            case "Autumn":
                result.add(theWeatherIs + " cool in the " + country);
                break;
            default:
                result.add(theWeatherIs + " cold in the " + country);
                break;
        }
    }
}
