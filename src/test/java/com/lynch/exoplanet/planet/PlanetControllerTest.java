package com.lynch.exoplanet.planet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PlanetControllerTest {

  @MockBean
  PlanetService planetService;


  @Test
  void getAllPlanets() {
  }

  @Test
  void getAllPlanetsStartingWith() {
  }

  @Test
  void getAllPlanetsContaining() {
  }

  @Test
  void getAllPlanetsByPage() {
  }

  @Test
  void getPlanet() {
  }

  @Test
  void getNearestPlanets() {
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
}
