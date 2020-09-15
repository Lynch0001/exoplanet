package com.lynch.exoplanet.planet;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PlanetServiceTest {

  @Mock
  PlanetRepository planetRepository;

  @InjectMocks
  PlanetService planetService;

  // Setup and Teardown

  @BeforeAll
  static void beforeAll() {
    System.out.println("Connect to the database");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("Load the schema");
  }

  @AfterEach
  void afterEach() {
    System.out.println("Drop the schema");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("Disconnect from the database");
  }

  // Test Methods

  @Test
  void getAllPlanets() {

  }

  @Test
  void getAllPlanetsByPage() {
  }

  @Test
  void addPlanet() {
  }

  @Test
  void getPlanet() {
    Optional<Planet> planet = planetService.getPlanet(1l);

    // Validate the response
    assertNotNull(planet);
  }

  @Test
  void editPlanet() {
  }

  @Test
  void deletePlanet() {
  }

  @Test
  void getPlanetsWithin5Parsecs() {
    List<Planet> within5Parsecs = planetService.getPlanetsWithin5Parsecs();

    // Validate the response
    Assertions.assertNotNull(within5Parsecs);
    Assertions.assertEquals(0, within5Parsecs.size());
    Assertions.assertNotNull(within5Parsecs.get(0));
  }

  @Test
  void getRockyPlanets() {

    // Execute the service that uses the mocked repository
    List<Planet> rockyPlanets = planetService.getRockyPlanets();

    // Validate the response
    Assertions.assertNotNull(rockyPlanets);
    Assertions.assertEquals(0, rockyPlanets.size());
    Assertions.assertNotNull(rockyPlanets.get(0));
  }

  @Test
  void get12AuPlanets() {
  }

  @Test
  void getEarthSizePlanets() {
  }

  @Test
  void getMultiPlanetSystems() {
  }

  @Test
  void getKeplerPlanets() {
  }

  @Test
  void getTrappistPlanets() {
  }

  @Test
  void getSuperEarthSizePlanets() {
  }

  @Test
  void getNasaInterestingPlanets() {
  }

  @Test
  void getPlanetsFoundByImaging() {
  }

  @Test
  void getPlanetsInBinarySystems() {
  }

  @Test
  void getAllPlanetsStartingWith() {
  }

  @Test
  void getAllPlanetsContaining() {
  }
}
