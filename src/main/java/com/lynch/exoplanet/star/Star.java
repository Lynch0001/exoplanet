package com.lynch.exoplanet.star;

import com.lynch.exoplanet.planet.Planet;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings("ALL")
@Entity
@Table(name="startable")
public class Star {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @Column(name="star_name", nullable = false)
  private String name;

  @Column(name="star_distance")
  private Double sDistance;

  @Column(name="star_mass")
  private Double sMass;

  @Column(name="star_radius")
  private Double sRadius;

  @SuppressWarnings("JpaDataSourceORMInspection")
  @Column(name="star_teff")
  private Double sTeff;

  @Column(name="star_numPlanets")
  private Integer numPlanets;

  @Column(name="star_hasExoPlanets")
  private boolean hasExoPlanets;

  @OneToMany(mappedBy="star")
  private final Set<Planet> planets;

  public Star(){
    planets = null;
  }

  public Star(Long id, String name, Double sDistance, Double sMass, Double sRadius, Double sTeff, Integer numPlanets, boolean hasExoPlanets, Set<Planet> planets) {
    this.id = id;
    this.name = name;
    this.sDistance = sDistance;
    this.sMass = sMass;
    this.sRadius = sRadius;
    this.sTeff = sTeff;
    this.numPlanets = numPlanets;
    this.hasExoPlanets = hasExoPlanets;
    this.planets = planets;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getsDistance() {
    return sDistance;
  }

  public void setsDistance(Double sDistance) {
    this.sDistance = sDistance;
  }

  public Double getsMass() {
    return sMass;
  }

  public void setsMass(Double sMass) {
    this.sMass = sMass;
  }

  public Double getsRadius() {
    return sRadius;
  }

  public void setsRadius(Double sRadius) {
    this.sRadius = sRadius;
  }

  public Double getsTeff() {
    return sTeff;
  }

  public void setsTeff(Double sTeff) {
    this.sTeff = sTeff;
  }

  public Integer getNumPlanets() {
    return numPlanets;
  }

  public void setNumPlanets(Integer numPlanets) {
    this.numPlanets = numPlanets;
  }

  public boolean getHasExoPlanets() {
    return hasExoPlanets;
  }

  public void setHasExoPlanets(boolean hasExoPlanets) {
    this.hasExoPlanets = hasExoPlanets;
  }

  public Set<Planet> getPlanets() {
    return planets;
  }
}
