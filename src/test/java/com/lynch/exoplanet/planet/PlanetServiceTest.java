package com.lynch.exoplanet.planet;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlanetServiceTest {

  @Autowired
  PlanetRepository planetRepository;

  private Planet planet1;
  private Planet planet2;

  // Setup and Teardown

  @BeforeAll
  static void beforeAll() {
    System.out.println("Connect to the database");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Load the schema");
    Planet planet1 = new Planet();
    Planet planet2 = new Planet();
    planet1.setId(9990l);
    planet2.setId(9991l);
    planet1.setPl_name("TestPlanet1");
    planet2.setPl_name("TestPlanet1");
    planet1.setHostname("TestPlanet1Star");
    planet2.setHostname("TestPlanet2Star");
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
    Optional<Planet> planet = planetRepository.findById(9990L);
    System.out.println("Found planet" + planet.toString());
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

  }

  @Test
  void getRockyPlanets() {


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
