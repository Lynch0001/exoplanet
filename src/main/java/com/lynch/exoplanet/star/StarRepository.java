package com.lynch.exoplanet.star;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StarRepository extends JpaRepository<Star, Long> {

  /*

  // TODO Resolve access to special repository filter methods

  public List<Star> getStarsByHasExoPlanets();

  public List<Star> getStarsOrderBySDistanceAsc();

  public Star getStarByNameContains(String name);

  public List<Star> getStarsOrderByNumPlanets();

  public List<Star> getStarsBySRadiusNotNullAndOrderBySRadiusDesc();

   */
}

