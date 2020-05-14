package com.lynch.exoplanet.planet;

import com.lynch.exoplanet.star.Star;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="planettable")
public class Planet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="pl_hostname")
	private String plHostName;

	@Column(name="pl_letter")
	private String plLetter;

	@Column(name="pl_name")
	private String plName;

	@Column(name="pl_discmeth")
	private String plDiscMeth;

	@Column(name="pl_orbper")
	private Double plOrbPer;

	@Column(name="pl_orbsmax")
	private Double plOrbSMAx;

	@Column(name="pl_orbeccen")
	private Double plOrbEccen;

	@Column(name="pl_orbincl")
	private Double plOrbIncl;

	@Column(name="pl_radj")
	private Double plRadJ;

	@Column(name="pl_dens")
	private Double plDens;

	@Column(name="rowupdate")
	private Date rowUpdate;

	@Column(name="pl_eqt")
	private Double plEqT;

	@Column(name="pl_massj")
	private Double plMassJ;

	@Column(name="pl_masse")
	private Double plMassE;

	@Column(name="pl_rade")
	private Double plRadE;

	@Column(name="pl_rads")
	private Double plRadS;

	@Column(name="pl_trandur")
	private Double plTranDur;

	@Column(name="pl_ratdor")
	private Double plRatDor;

	@Column(name="pl_ratror")
	private Double plRatRor;

	@Column(name="pl_disc")
	private Integer plDisc;

	@Column(name="pl_disc_reflink")
	private String plDiscRefLink;

	@Column(name="pl_locale")
	private String plLocale;

	@Column(name="pl_facility")
	private String plFacility;

	@Column(name="pl_telescope")
	private String plTelescope;

	@Column(name="pl_pelink")
	private String plPELink;

	@Column(name="pl_edelink")
	private String plEDELink;

	@Column(name="pl_publ_date")
	private String plPubDate;

	@ManyToOne
	@JoinColumn(name="star_id", nullable=false, updatable=false)
	@JsonIgnoreProperties("planets")
	private Star star;

	public Planet() {
	}

	public Planet(Long id, String plHostName, String plLetter, String plName, String plDiscMeth, Double plOrbPer, Double plOrbSMAx, Double plOrbEccen, Double plOrbIncl, Double plRadJ, Double plDens, Date rowUpdate, Double plEqT, Double plMassJ, Double plMassE, Double plRadE, Double plRadS, Double plTranDur, Double plRatDor, Double plRatRor, Integer plDisc, String plDiscRefLink, String plLocale, String plFacility, String plTelescope, String plPELink, String plEDELink, String plPubDate, Star star) {
		this.id = id;
		this.plHostName = plHostName;
		this.plLetter = plLetter;
		this.plName = plName;
		this.plDiscMeth = plDiscMeth;
		this.plOrbPer = plOrbPer;
		this.plOrbSMAx = plOrbSMAx;
		this.plOrbEccen = plOrbEccen;
		this.plOrbIncl = plOrbIncl;
		this.plRadJ = plRadJ;
		this.plDens = plDens;
		this.rowUpdate = rowUpdate;
		this.plEqT = plEqT;
		this.plMassJ = plMassJ;
		this.plMassE = plMassE;
		this.plRadE = plRadE;
		this.plRadS = plRadS;
		this.plTranDur = plTranDur;
		this.plRatDor = plRatDor;
		this.plRatRor = plRatRor;
		this.plDisc = plDisc;
		this.plDiscRefLink = plDiscRefLink;
		this.plLocale = plLocale;
		this.plFacility = plFacility;
		this.plTelescope = plTelescope;
		this.plPELink = plPELink;
		this.plEDELink = plEDELink;
		this.plPubDate = plPubDate;
		this.star = star;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlHostName() {
		return plHostName;
	}

	public void setPlHostName(String plHostName) {
		this.plHostName = plHostName;
	}

	public String getPlLetter() {
		return plLetter;
	}

	public void setPlLetter(String plLetter) {
		this.plLetter = plLetter;
	}

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public String getPlDiscMeth() {
		return plDiscMeth;
	}

	public void setPlDiscMeth(String plDiscMeth) {
		this.plDiscMeth = plDiscMeth;
	}

	public Double getPlOrbPer() {
		return plOrbPer;
	}

	public void setPlOrbPer(Double plOrbPer) {
		this.plOrbPer = plOrbPer;
	}

	public Double getPlOrbSMAx() {
		return plOrbSMAx;
	}

	public void setPlOrbSMAx(Double plOrbSMAx) {
		this.plOrbSMAx = plOrbSMAx;
	}

	public Double getPlOrbEccen() {
		return plOrbEccen;
	}

	public void setPlOrbEccen(Double plOrbEccen) {
		this.plOrbEccen = plOrbEccen;
	}

	public Double getPlOrbIncl() {
		return plOrbIncl;
	}

	public void setPlOrbIncl(Double plOrbIncl) {
		this.plOrbIncl = plOrbIncl;
	}

	public Double getPlRadJ() {
		return plRadJ;
	}

	public void setPlRadJ(Double plRadJ) {
		this.plRadJ = plRadJ;
	}

	public Double getPlDens() {
		return plDens;
	}

	public void setPlDens(Double plDens) {
		this.plDens = plDens;
	}

	public Date getRowUpdate() {
		return rowUpdate;
	}

	public void setRowUpdate(Date rowUpdate) {
		this.rowUpdate = rowUpdate;
	}

	public Double getPlEqT() {
		return plEqT;
	}

	public void setPlEqT(Double plEqT) {
		this.plEqT = plEqT;
	}

	public Double getPlMassJ() {
		return plMassJ;
	}

	public void setPlMassJ(Double plMassJ) {
		this.plMassJ = plMassJ;
	}

	public Double getPlMassE() {
		return plMassE;
	}

	public void setPlMassE(Double plMassE) {
		this.plMassE = plMassE;
	}

	public Double getPlRadE() {
		return plRadE;
	}

	public void setPlRadE(Double plRadE) {
		this.plRadE = plRadE;
	}

	public Double getPlRadS() {
		return plRadS;
	}

	public void setPlRadS(Double plRadS) {
		this.plRadS = plRadS;
	}

	public Double getPlTranDur() {
		return plTranDur;
	}

	public void setPlTranDur(Double plTranDur) {
		this.plTranDur = plTranDur;
	}

	public Double getPlRatDor() {
		return plRatDor;
	}

	public void setPlRatDor(Double plRatDor) {
		this.plRatDor = plRatDor;
	}

	public Double getPlRatRor() {
		return plRatRor;
	}

	public void setPlRatRor(Double plRatRor) {
		this.plRatRor = plRatRor;
	}

	public Integer getPlDisc() {
		return plDisc;
	}

	public void setPlDisc(Integer plDisc) {
		this.plDisc = plDisc;
	}

	public String getPlDiscRefLink() {
		return plDiscRefLink;
	}

	public void setPlDiscRefLink(String plDiscRefLink) {
		this.plDiscRefLink = plDiscRefLink;
	}

	public String getPlLocale() {
		return plLocale;
	}

	public void setPlLocale(String plLocale) {
		this.plLocale = plLocale;
	}

	public String getPlFacility() {
		return plFacility;
	}

	public void setPlFacility(String plFacility) {
		this.plFacility = plFacility;
	}

	public String getPlTelescope() {
		return plTelescope;
	}

	public void setPlTelescope(String plTelescope) {
		this.plTelescope = plTelescope;
	}

	public String getPlPELink() {
		return plPELink;
	}

	public void setPlPELink(String plPELink) {
		this.plPELink = plPELink;
	}

	public String getPlEDELink() {
		return plEDELink;
	}

	public void setPlEDELink(String plEDELink) {
		this.plEDELink = plEDELink;
	}

	public String getPlPubDate() {
		return plPubDate;
	}

	public void setPlPubDate(String plPubDate) {
		this.plPubDate = plPubDate;
	}

	public Star getStar() {
		return star;
	}

	public void setStar(Star star) {
		this.star = star;
	}
}
