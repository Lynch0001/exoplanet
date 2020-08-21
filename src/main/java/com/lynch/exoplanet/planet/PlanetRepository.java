package com.lynch.exoplanet.planet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

  @Query("SELECT p FROM Planet p where p.sy_dist <= 5")
  List<Planet> getPlanetsWithin5Parsecs();

  @Query("SELECT p FROM Planet p where p.pl_dens BETWEEN 3.6 AND 13.4")
  List<Planet> getRockyPlanets();

  @Query("SELECT p FROM Planet p where p.pl_orbsmax BETWEEN 1 AND 2")
  List<Planet> get12AuPlanets();

  @Query("SELECT p FROM Planet p where p.sy_pnum <> 1 ORDER BY p.pl_name")
  List<Planet> getMultiPlanetSystems();

  @Query("SELECT p FROM Planet p where p.pl_rade BETWEEN .75 AND 1.25")
  List<Planet> getEarthSizePlanets();

  @Query("SELECT p FROM Planet p where p.pl_rade BETWEEN 1.26 AND 2.00")
  List<Planet> getSuperEarthSizePlanets();

  @Query("SELECT p FROM Planet p where p.pl_name LIKE 'Kepler%'")
  List<Planet> getKeplerPlanets();

  @Query("SELECT p FROM Planet p where p.pl_name LIKE 'TRAPPIST%'")
  List<Planet> getTrappistPlanets();

  @Query("SELECT p FROM Planet p where p.id IN (136,201,246,254,257,258,261,267,271,305,1097,1116,1117,1252,1260,1261,2289,2422,3619,4154)")
  List<Planet> getNasaInterestingPlanets();

  @Query("SELECT p FROM Planet p where p.cb_flag = 1")
  List<Planet> getPlanetsInBinarySystems();

  @Query("SELECT p FROM Planet p where p.ima_flag = 1")
  List<Planet> getPlanetsFoundByImaging();
}
