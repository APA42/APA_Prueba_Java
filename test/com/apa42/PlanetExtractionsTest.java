package com.apa42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class PlanetExtractionsTest {

    @Test
    public void should_return_expected_output_for_earth_summer_uk(){
        Planet myPlanet = new Planet("earth", "Summer", "Summer");
        PlanetExtractions sut = new PlanetExtractions();

        List<String> result = sut.printPlanetFacts(myPlanet, "UK");

        List<String> expectedResultForSummer = Arrays.asList(
                "Planet name is earth",
                "Current season is Summer",
                "Number of times the planet rotates around the sun is 365",
                "Number of characters in planet name = 5",
                "The weather is hot in the UK"
        );
        Assertions.assertLinesMatch(result, expectedResultForSummer);
    }

    @Test
    public void should_return_expected_output_for_earth_spring_uk(){
        Planet myPlanet = new Planet("earth", "Spring", "Spring");
        PlanetExtractions sut = new PlanetExtractions();

        List<String> result = sut.printPlanetFacts(myPlanet, "UK");

        List<String> expectedResultForSummer = Arrays.asList(
                "Planet name is earth",
                "Current season is Spring",
                "Number of times the planet rotates around the sun is 365",
                "Number of characters in planet name = 5",
                "The weather is warm in the UK"
        );
        Assertions.assertLinesMatch(result, expectedResultForSummer);
    }

    @Test
    public void should_return_expected_output_for_earth_autumn_uk(){
        Planet myPlanet = new Planet("earth", "Autumn", "Autumn");
        PlanetExtractions sut = new PlanetExtractions();

        List<String> result = sut.printPlanetFacts(myPlanet, "UK");

        List<String> expectedResultForSummer = Arrays.asList(
                "Planet name is earth",
                "Current season is Autumn",
                "Number of times the planet rotates around the sun is 365",
                "Number of characters in planet name = 5",
                "The weather is cool in the UK"
        );
        Assertions.assertLinesMatch(result, expectedResultForSummer);
    }

    @Test
    public void should_return_expected_output_for_earth_default_uk(){
        Planet myPlanet = new Planet("earth", "", "");
        PlanetExtractions sut = new PlanetExtractions();

        List<String> result = sut.printPlanetFacts(myPlanet, "UK");

        List<String> expectedResultForSummer = Arrays.asList(
                "Planet name is earth",
                "Current season is ",
                "Number of times the planet rotates around the sun is 365",
                "Number of characters in planet name = 5",
                "The weather is cold in the UK"
        );
        Assertions.assertLinesMatch(result, expectedResultForSummer);
    }

}