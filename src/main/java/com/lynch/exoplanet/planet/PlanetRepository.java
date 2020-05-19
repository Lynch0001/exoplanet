package com.lynch.exoplanet.planet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

  @Query("SELECT p.pl_hostname FROM Planet p where p.st_dist <= 100")
  public List<Planet> getPlanetsWithin100Parsecs();
}
