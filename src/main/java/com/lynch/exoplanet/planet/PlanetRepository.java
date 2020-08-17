package com.lynch.exoplanet.planet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

  @Query("SELECT p FROM Planet p where p.st_dist <= 5")
  public List<Planet> getPlanetsWithin5Parsecs();

  @Query("SELECT p FROM Planet p where p.pl_dens BETWEEN 3.6 AND 13.4")
  public List<Planet> getRockyPlanets();

  @Query("SELECT p FROM Planet p where p.pl_orbsmax BETWEEN 1 AND 2")
  public List<Planet> get12AuPlanets();

  @Query("SELECT p FROM Planet p where p.pl_pnum <> 1 ORDER BY p.pl_name")
  public List<Planet> getMultiPlanetSystems();

  @Query("SELECT p FROM Planet p where p.pl_rade BETWEEN .75 AND 1.25")
  public List<Planet> getEarthSizePlanets();

  @Query("SELECT p FROM Planet p where p.pl_rade BETWEEN 1.26 AND 2.00")
  public List<Planet> getSuperEarthSizePlanets();

  @Query("SELECT p FROM Planet p where p.pl_name LIKE 'Kepler%'")
  public List<Planet> getKeplerPlanets();

  @Query("SELECT p FROM Planet p where p.pl_name LIKE 'TRAPPIST%'")
  public List<Planet> getTrappistPlanets();

  @Query("SELECT p FROM Planet p where p.id IN (1,2,3,4,5)")
  public List<Planet> getNasaInterestingPlanets();
}
