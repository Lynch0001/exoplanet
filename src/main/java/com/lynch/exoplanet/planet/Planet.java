package com.lynch.exoplanet.planet;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "planettable")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "pl_hostname")
	private String pl_hostname;

	@Column(name = "pl_letter")
	private String pl_letter;

	@Column(name = "pl_name")
	private String pl_name;

	@Column(name = "pl_discmethod")
	private String pl_discmethod;

	@Column(name = "pl_orbper")
	private Double pl_orbper;

	@Column(name = "pl_orbsmax")
	private Double pl_orbsmax;

	@Column(name = "pl_orbeccen")
	private Double pl_orbeccen;

	@Column(name = "pl_orbincl")
	private Double pl_orbincl;

	@Column(name = "pl_radj")
	private Double pl_radj;

	@Column(name = "pl_dens")
	private Double pl_dens;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "rowupdate")
	private Date rowupdate;

	@Column(name = "pl_eqt")
	private Double pl_eqt;

	@Column(name = "pl_massj")
	private Double pl_massj;

	@Column(name = "pl_masse")
	private Double pl_masse;

	@Column(name = "pl_rade")
	private Double pl_rade;

	@Column(name = "pl_rads")
	private Double pl_rads;

	@Column(name = "pl_trandur")
	private Double pl_trandur;

	@Column(name = "pl_ratdor")
	private Double pl_ratdor;

	@Column(name = "pl_ratror")
	private Double pl_ratror;

	@Column(name = "pl_disc")
	private Integer pl_disc;

	@Column(name = "pl_disc_reflink")
	private String pl_disc_reflink;

	@Column(name = "pl_locale")
	private String pl_locale;

	@Column(name = "pl_facility")
	private String pl_facility;

	@Column(name = "pl_telescope")
	private String pl_telescope;

	@Column(name = "pl_pelink")
	private String pl_pelink;

	@Column(name = "pl_edelink")
	private String pl_edelink;

	@Column(name = "pl_publ_date")
	private String pl_publ_date;

	// Star Entity integration Starts

	@Column(name = "pl_pnum")
	private Integer pl_pnum;

	@Column(name = "ra")
	private Double ra;

	@Column(name = "dec")
	private Double dec;

	@Column(name = "st_dist")
	private Double st_dist;

	@Column(name = "st_optmag")
	private Double st_optmag;

	@SuppressWarnings("JpaDataSourceORMInspection")
	@Column(name = "st_teff")
	private Double st_teff;

	@Column(name = "st_mass")
	private Double st_mass;

	@Column(name = "st_rad")
	private Double st_rad;

	@Column(name = "hd_name")
	private String hd_name;

	@Column(name = "hip_name")
	private String hip_name;

	@Column(name = "st_rah")
	private Double st_rah;

	@Column(name = "st_glon")
	private Double st_glon;

	@Column(name = "st_glat")
	private Double st_glat;

	@Column(name = "st_radv")
	private Double st_radv;

	@Column(name = "st_logg")
	private Double st_logg;

	@Column(name = "st_lum")
	private Double st_lum;

	@Column(name = "st_dens")
	private Double st_dens;

	@Column(name = "st_metfe")
	private Double st_metfe;

	@Column(name = "st_metratio")
	private String st_metratio;

	@Column(name = "st_age")
	private Double st_age;

	@Column(name = "st_vsini")
	private Double st_vsini;

	@Column(name = "st_acts")
	private Double st_acts;

	@Column(name = "st_actr")
	private Double st_actr;

	@Column(name = "st_actlx")
	private Double st_actlx;

	public Planet() {
	}

	public Planet(Long id, String pl_hostname, String pl_letter, String pl_name, String pl_discmethod, Double pl_orbper, Double pl_orbsmax, Double pl_orbeccen, Double pl_orbincl, Double pl_radj, Double pl_dens, Date rowupdate, Double pl_eqt, Double pl_massj, Double pl_masse, Double pl_rade, Double pl_rads, Double pl_trandur, Double pl_ratdor, Double pl_ratror, Integer pl_disc, String pl_disc_reflink, String pl_locale, String pl_facility, String pl_telescope, String pl_pelink, String pl_edelink, String pl_publ_date, Integer pl_pnum, Double ra, Double dec, Double st_dist, Double st_optmag, Double st_teff, Double st_mass, Double st_rad, String hd_name, String hip_name, Double st_rah, Double st_glon, Double st_glat, Double st_radv, Double st_logg, Double st_lum, Double st_dens, Double st_metfe, String st_metratio, Double st_age, Double st_vsini, Double st_acts, Double st_actr, Double st_actlx) {
		this.id = id;
		this.pl_hostname = pl_hostname;
		this.pl_letter = pl_letter;
		this.pl_name = pl_name;
		this.pl_discmethod = pl_discmethod;
		this.pl_orbper = pl_orbper;
		this.pl_orbsmax = pl_orbsmax;
		this.pl_orbeccen = pl_orbeccen;
		this.pl_orbincl = pl_orbincl;
		this.pl_radj = pl_radj;
		this.pl_dens = pl_dens;
		this.rowupdate = rowupdate;
		this.pl_eqt = pl_eqt;
		this.pl_massj = pl_massj;
		this.pl_masse = pl_masse;
		this.pl_rade = pl_rade;
		this.pl_rads = pl_rads;
		this.pl_trandur = pl_trandur;
		this.pl_ratdor = pl_ratdor;
		this.pl_ratror = pl_ratror;
		this.pl_disc = pl_disc;
		this.pl_disc_reflink = pl_disc_reflink;
		this.pl_locale = pl_locale;
		this.pl_facility = pl_facility;
		this.pl_telescope = pl_telescope;
		this.pl_pelink = pl_pelink;
		this.pl_edelink = pl_edelink;
		this.pl_publ_date = pl_publ_date;
		this.pl_pnum = pl_pnum;
		this.ra = ra;
		this.dec = dec;
		this.st_dist = st_dist;
		this.st_optmag = st_optmag;
		this.st_teff = st_teff;
		this.st_mass = st_mass;
		this.st_rad = st_rad;
		this.hd_name = hd_name;
		this.hip_name = hip_name;
		this.st_rah = st_rah;
		this.st_glon = st_glon;
		this.st_glat = st_glat;
		this.st_radv = st_radv;
		this.st_logg = st_logg;
		this.st_lum = st_lum;
		this.st_dens = st_dens;
		this.st_metfe = st_metfe;
		this.st_metratio = st_metratio;
		this.st_age = st_age;
		this.st_vsini = st_vsini;
		this.st_acts = st_acts;
		this.st_actr = st_actr;
		this.st_actlx = st_actlx;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPl_hostname() {
		return pl_hostname;
	}

	public void setPl_hostname(String pl_hostname) {
		this.pl_hostname = pl_hostname;
	}

	public String getPl_letter() {
		return pl_letter;
	}

	public void setPl_letter(String pl_letter) {
		this.pl_letter = pl_letter;
	}

	public String getPl_name() {
		return pl_name;
	}

	public void setPl_name(String pl_name) {
		this.pl_name = pl_name;
	}

	public String getPl_discmethod() {
		return pl_discmethod;
	}

	public void setPl_discmethod(String pl_discmethod) {
		this.pl_discmethod = pl_discmethod;
	}

	public Double getPl_orbper() {
		return pl_orbper;
	}

	public void setPl_orbper(Double pl_orbper) {
		this.pl_orbper = pl_orbper;
	}

	public Double getPl_orbsmax() {
		return pl_orbsmax;
	}

	public void setPl_orbsmax(Double pl_orbsmax) {
		this.pl_orbsmax = pl_orbsmax;
	}

	public Double getPl_orbeccen() {
		return pl_orbeccen;
	}

	public void setPl_orbeccen(Double pl_orbeccen) {
		this.pl_orbeccen = pl_orbeccen;
	}

	public Double getPl_orbincl() {
		return pl_orbincl;
	}

	public void setPl_orbincl(Double pl_orbincl) {
		this.pl_orbincl = pl_orbincl;
	}

	public Double getPl_radj() {
		return pl_radj;
	}

	public void setPl_radj(Double pl_radj) {
		this.pl_radj = pl_radj;
	}

	public Double getPl_dens() {
		return pl_dens;
	}

	public void setPl_dens(Double pl_dens) {
		this.pl_dens = pl_dens;
	}

	public Date getRowupdate() {
		return rowupdate;
	}

	public void setRowupdate(Date rowupdate) {
		this.rowupdate = rowupdate;
	}

	public Double getPl_eqt() {
		return pl_eqt;
	}

	public void setPl_eqt(Double pl_eqt) {
		this.pl_eqt = pl_eqt;
	}

	public Double getPl_massj() {
		return pl_massj;
	}

	public void setPl_massj(Double pl_massj) {
		this.pl_massj = pl_massj;
	}

	public Double getPl_masse() {
		return pl_masse;
	}

	public void setPl_masse(Double pl_masse) {
		this.pl_masse = pl_masse;
	}

	public Double getPl_rade() {
		return pl_rade;
	}

	public void setPl_rade(Double pl_rade) {
		this.pl_rade = pl_rade;
	}

	public Double getPl_rads() {
		return pl_rads;
	}

	public void setPl_rads(Double pl_rads) {
		this.pl_rads = pl_rads;
	}

	public Double getPl_trandur() {
		return pl_trandur;
	}

	public void setPl_trandur(Double pl_trandur) {
		this.pl_trandur = pl_trandur;
	}

	public Double getPl_ratdor() {
		return pl_ratdor;
	}

	public void setPl_ratdor(Double pl_ratdor) {
		this.pl_ratdor = pl_ratdor;
	}

	public Double getPl_ratror() {
		return pl_ratror;
	}

	public void setPl_ratror(Double pl_ratror) {
		this.pl_ratror = pl_ratror;
	}

	public Integer getPl_disc() {
		return pl_disc;
	}

	public void setPl_disc(Integer pl_disc) {
		this.pl_disc = pl_disc;
	}

	public String getPl_disc_reflink() {
		return pl_disc_reflink;
	}

	public void setPl_disc_reflink(String pl_disc_reflink) {
		this.pl_disc_reflink = pl_disc_reflink;
	}

	public String getPl_locale() {
		return pl_locale;
	}

	public void setPl_locale(String pl_locale) {
		this.pl_locale = pl_locale;
	}

	public String getPl_facility() {
		return pl_facility;
	}

	public void setPl_facility(String pl_facility) {
		this.pl_facility = pl_facility;
	}

	public String getPl_telescope() {
		return pl_telescope;
	}

	public void setPl_telescope(String pl_telescope) {
		this.pl_telescope = pl_telescope;
	}

	public String getPl_pelink() {
		return pl_pelink;
	}

	public void setPl_pelink(String pl_pelink) {
		this.pl_pelink = pl_pelink;
	}

	public String getPl_edelink() {
		return pl_edelink;
	}

	public void setPl_edelink(String pl_edelink) {
		this.pl_edelink = pl_edelink;
	}

	public String getPl_publ_date() {
		return pl_publ_date;
	}

	public void setPl_publ_date(String pl_publ_date) {
		this.pl_publ_date = pl_publ_date;
	}

	public Integer getPl_pnum() {
		return pl_pnum;
	}

	public void setPl_pnum(Integer pl_pnum) {
		this.pl_pnum = pl_pnum;
	}

	public Double getRa() {
		return ra;
	}

	public void setRa(Double ra) {
		this.ra = ra;
	}

	public Double getDec() {
		return dec;
	}

	public void setDec(Double dec) {
		this.dec = dec;
	}

	public Double getSt_dist() {
		return st_dist;
	}

	public void setSt_dist(Double st_dist) {
		this.st_dist = st_dist;
	}

	public Double getSt_optmag() {
		return st_optmag;
	}

	public void setSt_optmag(Double st_optmag) {
		this.st_optmag = st_optmag;
	}

	public Double getSt_teff() {
		return st_teff;
	}

	public void setSt_teff(Double st_teff) {
		this.st_teff = st_teff;
	}

	public Double getSt_mass() {
		return st_mass;
	}

	public void setSt_mass(Double st_mass) {
		this.st_mass = st_mass;
	}

	public Double getSt_rad() {
		return st_rad;
	}

	public void setSt_rad(Double st_rad) {
		this.st_rad = st_rad;
	}

	public String getHd_name() {
		return hd_name;
	}

	public void setHd_name(String hd_name) {
		this.hd_name = hd_name;
	}

	public String getHip_name() {
		return hip_name;
	}

	public void setHip_name(String hip_name) {
		this.hip_name = hip_name;
	}

	public Double getSt_rah() {
		return st_rah;
	}

	public void setSt_rah(Double st_rah) {
		this.st_rah = st_rah;
	}

	public Double getSt_glon() {
		return st_glon;
	}

	public void setSt_glon(Double st_glon) {
		this.st_glon = st_glon;
	}

	public Double getSt_glat() {
		return st_glat;
	}

	public void setSt_glat(Double st_glat) {
		this.st_glat = st_glat;
	}

	public Double getSt_radv() {
		return st_radv;
	}

	public void setSt_radv(Double st_radv) {
		this.st_radv = st_radv;
	}

	public Double getSt_logg() {
		return st_logg;
	}

	public void setSt_logg(Double st_logg) {
		this.st_logg = st_logg;
	}

	public Double getSt_lum() {
		return st_lum;
	}

	public void setSt_lum(Double st_lum) {
		this.st_lum = st_lum;
	}

	public Double getSt_dens() {
		return st_dens;
	}

	public void setSt_dens(Double st_dens) {
		this.st_dens = st_dens;
	}

	public Double getSt_metfe() {
		return st_metfe;
	}

	public void setSt_metfe(Double st_metfe) {
		this.st_metfe = st_metfe;
	}

	public String getSt_metratio() {
		return st_metratio;
	}

	public void setSt_metratio(String st_metratio) {
		this.st_metratio = st_metratio;
	}

	public Double getSt_age() {
		return st_age;
	}

	public void setSt_age(Double st_age) {
		this.st_age = st_age;
	}

	public Double getSt_vsini() {
		return st_vsini;
	}

	public void setSt_vsini(Double st_vsini) {
		this.st_vsini = st_vsini;
	}

	public Double getSt_acts() {
		return st_acts;
	}

	public void setSt_acts(Double st_acts) {
		this.st_acts = st_acts;
	}

	public Double getSt_actr() {
		return st_actr;
	}

	public void setSt_actr(Double st_actr) {
		this.st_actr = st_actr;
	}

	public Double getSt_actlx() {
		return st_actlx;
	}

	public void setSt_actlx(Double st_actlx) {
		this.st_actlx = st_actlx;
	}
}