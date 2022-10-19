package com.apa42;

import java.util.ArrayList;
import java.util.List;

public class PlanetExtractions {

    public static final int NUMBER_OF_DAYS_IN_A_YEAR = 365;
    private static String theWeatherIs;

    public List<String> printPlanetFacts(Planet planet, String country) {
        List<String> result = new ArrayList<>();
        result.add("Planet name is " + planet.getName());
        result.add("Current season is " + planet.getCountryWeather());
        result.add("Number of times the planet rotates around the sun is " + NUMBER_OF_DAYS_IN_A_YEAR);
        int planetNameLength = planet.getName().length();
        result.add("Number of characters in planet name = " + planetNameLength);
        updateWithWeather(planet, result);

        return result;
    }

    private static void updateWithWeather(Planet planet, List<String> result) {
        switch (planet.getCountryWeather()) {
            case "Spring":
                theWeatherIs = "The weather is";
                result.add(theWeatherIs + " warm in the UK");
                break;
            case "Summer":
                result.add(theWeatherIs + " hot in the UK");
                break;
            case "Autumn":
                result.add(theWeatherIs + " cool in the UK");
                break;
            default:
                result.add(theWeatherIs + " cold in the UK");
                break;
        }
    }
}
