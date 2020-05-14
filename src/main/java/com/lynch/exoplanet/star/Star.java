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

  @Column(name="st_name", nullable = false)
  private String sName;

  @Column(name="st_pnum")
  private Integer sNumPlanets;

  @Column(name="st_ra")
  private String sRa;

  @Column(name="st_dec")
  private String sDec;

  @Column(name="st_dist")
  private Double sDistance;

  @Column(name="st_optmag")
  private Double sOptMag;

  @SuppressWarnings("JpaDataSourceORMInspection")
  @Column(name="st_teff")
  private Double sTeff;

  @Column(name="st_mass")
  private Double sMass;

  @Column(name="st_rad")
  private Double sRadius;

  @Column(name="hd_name")
  private String hdName;

  @Column(name="hip_name")
  private String hipName;

  @Column(name="st_rah")
  private Double sRah;

  @Column(name="st_glon")
  private Double sGlon;

  @Column(name="st_glat")
  private Double sGlat;

  @Column(name="st_radv")
  private Double sRadv;

  @Column(name="st_logg")
  private Double sLogg;

  @Column(name="st_lum")
  private Double sLum;

  @Column(name="st_dens")
  private Double sDens;

  @Column(name="st_metfe")
  private Double sMetfe;

  @Column(name="st_metratio")
  private String sMetRatio;

  @Column(name="st_age")
  private Double sAge;

  @Column(name="st_vsini")
  private Double sVsini;

  @Column(name="st_acts")
  private Double sActs;

  @Column(name="st_actr")
  private Double sActr;

  @Column(name="st_actlx")
  private Double sActlx;

  @OneToMany(mappedBy="star")
  private final Set<Planet> planets;

  public Star(){
    planets = null;
  }

  public Star(Long id, String sName, Integer sNumPlanets, Double sDistance, Double sOptMag, Double sTeff, Double sMass, Double sRadius, String hdName, String hipName, Double sRah, Double sGlon, Double sGlat, Double sRadv, Double sLogg, Double sLum, Double sDens, Double sMetfe, String sMetRatio, Double sAge, Double sVsini, Double sActs, Double sActr, Double sActlx, Set<Planet> planets) {
    this.id = id;
    this.sName = sName;
    this.sNumPlanets = sNumPlanets;
    this.sDistance = sDistance;
    this.sOptMag = sOptMag;
    this.sTeff = sTeff;
    this.sMass = sMass;
    this.sRadius = sRadius;
    this.hdName = hdName;
    this.hipName = hipName;
    this.sRah = sRah;
    this.sGlon = sGlon;
    this.sGlat = sGlat;
    this.sRadv = sRadv;
    this.sLogg = sLogg;
    this.sLum = sLum;
    this.sDens = sDens;
    this.sMetfe = sMetfe;
    this.sMetRatio = sMetRatio;
    this.sAge = sAge;
    this.sVsini = sVsini;
    this.sActs = sActs;
    this.sActr = sActr;
    this.sActlx = sActlx;
    this.planets = planets;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public Integer getsNumPlanets() {
    return sNumPlanets;
  }

  public void setsNumPlanets(Integer sNumPlanets) {
    this.sNumPlanets = sNumPlanets;
  }

  public Double getsDistance() {
    return sDistance;
  }

  public void setsDistance(Double sDistance) {
    this.sDistance = sDistance;
  }

  public String getsRa() {
    return sRa;
  }

  public void setsRa(String sRa) {
    this.sRa = sRa;
  }

  public String getsDec() {
    return sDec;
  }

  public void setsDec(String sDec) {
    this.sDec = sDec;
  }

  public Double getsOptMag() {
    return sOptMag;
  }

  public void setsOptMag(Double sOptMag) {
    this.sOptMag = sOptMag;
  }

  public Double getsTeff() {
    return sTeff;
  }

  public void setsTeff(Double sTeff) {
    this.sTeff = sTeff;
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

  public String getHdName() {
    return hdName;
  }

  public void setHdName(String hdName) {
    this.hdName = hdName;
  }

  public String getHipName() {
    return hipName;
  }

  public void setHipName(String hipName) {
    this.hipName = hipName;
  }

  public Double getsRah() {
    return sRah;
  }

  public void setsRah(Double sRah) {
    this.sRah = sRah;
  }

  public Double getsGlon() {
    return sGlon;
  }

  public void setsGlon(Double sGlon) {
    this.sGlon = sGlon;
  }

  public Double getsGlat() {
    return sGlat;
  }

  public void setsGlat(Double sGlat) {
    this.sGlat = sGlat;
  }

  public Double getsRadv() {
    return sRadv;
  }

  public void setsRadv(Double sRadv) {
    this.sRadv = sRadv;
  }

  public Double getsLogg() {
    return sLogg;
  }

  public void setsLogg(Double sLogg) {
    this.sLogg = sLogg;
  }

  public Double getsLum() {
    return sLum;
  }

  public void setsLum(Double sLum) {
    this.sLum = sLum;
  }

  public Double getsDens() {
    return sDens;
  }

  public void setsDens(Double sDens) {
    this.sDens = sDens;
  }

  public Double getsMetfe() {
    return sMetfe;
  }

  public void setsMetfe(Double sMetfe) {
    this.sMetfe = sMetfe;
  }

  public String getsMetRatio() {
    return sMetRatio;
  }

  public void setsMetRatio(String sMetRatio) {
    this.sMetRatio = sMetRatio;
  }

  public Double getsAge() {
    return sAge;
  }

  public void setsAge(Double sAge) {
    this.sAge = sAge;
  }

  public Double getsVsini() {
    return sVsini;
  }

  public void setsVsini(Double sVsini) {
    this.sVsini = sVsini;
  }

  public Double getsActs() {
    return sActs;
  }

  public void setsActs(Double sActs) {
    this.sActs = sActs;
  }

  public Double getsActr() {
    return sActr;
  }

  public void setsActr(Double sActr) {
    this.sActr = sActr;
  }

  public Double getsActlx() {
    return sActlx;
  }

  public void setsActlx(Double sActlx) {
    this.sActlx = sActlx;
  }

  public Set<Planet> getPlanets() {
    return planets;
  }
}
