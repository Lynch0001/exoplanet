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

	@Column(name = "pl_bmassj")
	private Double pl_bmassj;

	@Column(name = "pl_bmasse")
	private Double pl_bmasse;

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

	@Column(name = "pl_bmassprov")
	private String pl_bmassprov;

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

	@Column(name = "st_spstr")
	private String st_spstr;

	@Column(name = "st_disterr1")
	private String st_disterr1;

	@Column(name = "st_disterr2")
	private String st_disterr2;

	@Column(name = "st_tefferr1")
	private String st_tefferr1;

	@Column(name = "st_tefferr2")
	private String st_tefferr2;

	@Column(name = "st_masserr1")
	private String st_masserr1;

	@Column(name = "st_masserr2")
	private String st_masserr2;

	@Column(name = "st_raderr1")
	private String st_raderr1;

	@Column(name = "st_raderr2")
	private String st_raderr2;

	@Column(name = "st_loggerr1")
	private String st_loggerr1;

	@Column(name = "st_loggerr2")
	private String st_loggerr2;

	@Column(name = "st_denserr1")
	private String st_denserr1;

	@Column(name = "st_denserr2")
	private String st_denserr2;


	@Column(name = "pl_eqterr1")
	private String pl_eqterr1;

	@Column(name = "pl_eqterr2")
	private String pl_eqterr2;

	@Column(name = "pl_bmasseerr1")
	private String pl_bmasseerr1;

	@Column(name = "pl_bmasseerr2")
	private String pl_bmasseerr2;

	@Column(name = "pl_bmassjerr1")
	private String pl_bmassjerr1;

	@Column(name = "pl_bmassjerr2")
	private String pl_bmassjerr2;

	@Column(name = "pl_denserr1")
	private String pl_denserr1;

	@Column(name = "pl_denserr2")
	private String pl_denserr2;

	@Column(name = "pl_radeerr1")
	private String pl_radeerr1;

	@Column(name = "pl_radeerr2")
	private String pl_radeerr2;

	@Column(name = "pl_radjerr1")
	private String pl_radjerr1;

	@Column(name = "pl_radjerr2")
	private String pl_radjerr2;

	@Column(name = "pl_radserr1")
	private String pl_radserr1;

	@Column(name = "pl_radserr2")
	private String pl_radserr2;

	@Column(name = "pl_orbeccenerr1")
	private String pl_orbeccenerr1;

	@Column(name = "pl_orbeccenerr2")
	private String pl_orbeccenerr2;


	@Column(name = "pl_orbinclerr1")
	private String pl_orbinclerr1;

	@Column(name = "pl_orbinclerr2")
	private String pl_orbinclerr2;


	@Column(name = "pl_orbsmaxerr1")
	private String pl_orbsmaxerr1;

	@Column(name = "pl_orbsmaxerr2")
	private String pl_orbsmaxerr2;


	@Column(name = "pl_orbpererr1")
	private String pl_orbpererr1;

	@Column(name = "pl_orbpererr2")
	private String pl_orbpererr2;

	@Column(name = "st_radverr1")
	private String st_radverr1;

	@Column(name = "st_radverr2")
	private String st_radverr2;


	@Column(name = "st_vsinierr1")
	private String st_vsinierr1;

	@Column(name = "st_vsinierr2")
	private String st_vsinierr2;

	@Column(name = "st_metfeerr1")
	private String st_metfeerr1;

	@Column(name = "st_metfeerr2")
	private String st_metfeerr2;



	/*
	 *  Constructor
	 */

	public Planet() {
	}

	/*
	 * Getters and Setters
	 */

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

	public Double getPl_bmassj() {
		return pl_bmassj;
	}

	public void setPl_bmassj(Double pl_bmassj) {
		this.pl_bmassj = pl_bmassj;
	}

	public Double getPl_bmasse() {
		return pl_bmasse;
	}

	public void setPl_bmasse(Double pl_bmasse) {
		this.pl_bmasse = pl_bmasse;
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

	public String getSt_spstr() {
		return st_spstr;
	}

	public void setSt_spstr(String st_spstr) {
		this.st_spstr = st_spstr;
	}

	public String getPl_bmassprov() {
		return pl_bmassprov;
	}

	public void setPl_bmassprov(String pl_bmassprov) {
		this.pl_bmassprov = pl_bmassprov;
	}

	public String getSt_disterr1() {
		return st_disterr1;
	}

	public void setSt_disterr1(String st_disterr1) {
		this.st_disterr1 = st_disterr1;
	}

	public String getSt_disterr2() {
		return st_disterr2;
	}

	public void setSt_disterr2(String st_disterr2) {
		this.st_disterr2 = st_disterr2;
	}

	public String getSt_tefferr1() {
		return st_tefferr1;
	}

	public void setSt_tefferr1(String st_tefferr1) {
		this.st_tefferr1 = st_tefferr1;
	}

	public String getSt_tefferr2() {
		return st_tefferr2;
	}

	public void setSt_tefferr2(String st_tefferr2) {
		this.st_tefferr2 = st_tefferr2;
	}

	public String getSt_masserr1() {
		return st_masserr1;
	}

	public void setSt_masserr1(String st_masserr1) {
		this.st_masserr1 = st_masserr1;
	}

	public String getSt_masserr2() {
		return st_masserr2;
	}

	public void setSt_masserr2(String st_masserr2) {
		this.st_masserr2 = st_masserr2;
	}

	public String getSt_raderr1() {
		return st_raderr1;
	}

	public void setSt_raderr1(String st_raderr1) {
		this.st_raderr1 = st_raderr1;
	}

	public String getSt_raderr2() {
		return st_raderr2;
	}

	public void setSt_raderr2(String st_raderr2) {
		this.st_raderr2 = st_raderr2;
	}

	public String getSt_loggerr1() {
		return st_loggerr1;
	}

	public void setSt_loggerr1(String st_loggerr1) {
		this.st_loggerr1 = st_loggerr1;
	}

	public String getSt_loggerr2() {
		return st_loggerr2;
	}

	public void setSt_loggerr2(String st_loggerr2) {
		this.st_loggerr2 = st_loggerr2;
	}

	public String getSt_denserr1() {
		return st_denserr1;
	}

	public void setSt_denserr1(String st_denserr1) {
		this.st_denserr1 = st_denserr1;
	}

	public String getSt_denserr2() {
		return st_denserr2;
	}

	public void setSt_denserr2(String st_denserr2) {
		this.st_denserr2 = st_denserr2;
	}

	public String getPl_eqterr1() {
		return pl_eqterr1;
	}

	public void setPl_eqterr1(String pl_eqterr1) {
		this.pl_eqterr1 = pl_eqterr1;
	}

	public String getPl_eqterr2() {
		return pl_eqterr2;
	}

	public void setPl_eqterr2(String pl_eqterr2) {
		this.pl_eqterr2 = pl_eqterr2;
	}

	public String getPl_bmasseerr1() {
		return pl_bmasseerr1;
	}

	public void setPl_bmasseerr1(String pl_bmasseerr1) {
		this.pl_bmasseerr1 = pl_bmasseerr1;
	}

	public String getPl_bmasseerr2() {
		return pl_bmasseerr2;
	}

	public void setPl_bmasseerr2(String pl_bmasseerr2) {
		this.pl_bmasseerr2 = pl_bmasseerr2;
	}

	public String getPl_bmassjerr1() {
		return pl_bmassjerr1;
	}

	public void setPl_bmassjerr1(String pl_bmassjerr1) {
		this.pl_bmassjerr1 = pl_bmassjerr1;
	}

	public String getPl_bmassjerr2() {
		return pl_bmassjerr2;
	}

	public void setPl_bmassjerr2(String pl_bmassjerr2) {
		this.pl_bmassjerr2 = pl_bmassjerr2;
	}

	public String getPl_denserr1() {
		return pl_denserr1;
	}

	public void setPl_denserr1(String pl_denserr1) {
		this.pl_denserr1 = pl_denserr1;
	}

	public String getPl_denserr2() {
		return pl_denserr2;
	}

	public void setPl_denserr2(String pl_denserr2) {
		this.pl_denserr2 = pl_denserr2;
	}

	public String getPl_radeerr1() {
		return pl_radeerr1;
	}

	public void setPl_radeerr1(String pl_radeerr1) {
		this.pl_radeerr1 = pl_radeerr1;
	}

	public String getPl_radeerr2() {
		return pl_radeerr2;
	}

	public void setPl_radeerr2(String pl_radeerr2) {
		this.pl_radeerr2 = pl_radeerr2;
	}

	public String getPl_radjerr1() {
		return pl_radjerr1;
	}

	public void setPl_radjerr1(String pl_radjerr1) {
		this.pl_radjerr1 = pl_radjerr1;
	}

	public String getPl_radjerr2() {
		return pl_radjerr2;
	}

	public void setPl_radjerr2(String pl_radjerr2) {
		this.pl_radjerr2 = pl_radjerr2;
	}

	public String getPl_radserr1() {
		return pl_radserr1;
	}

	public void setPl_radserr1(String pl_radserr1) {
		this.pl_radserr1 = pl_radserr1;
	}

	public String getPl_radserr2() {
		return pl_radserr2;
	}

	public void setPl_radserr2(String pl_radserr2) {
		this.pl_radserr2 = pl_radserr2;
	}

	public String getPl_orbeccenerr1() {
		return pl_orbeccenerr1;
	}

	public void setPl_orbeccenerr1(String pl_orbeccenerr1) {
		this.pl_orbeccenerr1 = pl_orbeccenerr1;
	}

	public String getPl_orbeccenerr2() {
		return pl_orbeccenerr2;
	}

	public void setPl_orbeccenerr2(String pl_orbeccenerr2) {
		this.pl_orbeccenerr2 = pl_orbeccenerr2;
	}

	public String getPl_orbinclerr1() {
		return pl_orbinclerr1;
	}

	public void setPl_orbinclerr1(String pl_orbinclerr1) {
		this.pl_orbinclerr1 = pl_orbinclerr1;
	}

	public String getPl_orbinclerr2() {
		return pl_orbinclerr2;
	}

	public void setPl_orbinclerr2(String pl_orbinclerr2) {
		this.pl_orbinclerr2 = pl_orbinclerr2;
	}

	public String getPl_orbsmaxerr1() {
		return pl_orbsmaxerr1;
	}

	public void setPl_orbsmaxerr1(String pl_orbsmaxerr1) {
		this.pl_orbsmaxerr1 = pl_orbsmaxerr1;
	}

	public String getPl_orbsmaxerr2() {
		return pl_orbsmaxerr2;
	}

	public void setPl_orbsmaxerr2(String pl_orbsmaxerr2) {
		this.pl_orbsmaxerr2 = pl_orbsmaxerr2;
	}

	public String getPl_orbpererr1() {
		return pl_orbpererr1;
	}

	public void setPl_orbpererr1(String pl_orbpererr1) {
		this.pl_orbpererr1 = pl_orbpererr1;
	}

	public String getPl_orbpererr2() {
		return pl_orbpererr2;
	}

	public void setPl_orbpererr2(String pl_orbpererr2) {
		this.pl_orbpererr2 = pl_orbpererr2;
	}

	public String getSt_radverr1() {
		return st_radverr1;
	}

	public void setSt_radverr1(String st_radverr1) {
		this.st_radverr1 = st_radverr1;
	}

	public String getSt_radverr2() {
		return st_radverr2;
	}

	public void setSt_radverr2(String st_radverr2) {
		this.st_radverr2 = st_radverr2;
	}

	public String getSt_vsinierr1() {
		return st_vsinierr1;
	}

	public void setSt_vsinierr1(String st_vsinierr1) {
		this.st_vsinierr1 = st_vsinierr1;
	}

	public String getSt_vsinierr2() {
		return st_vsinierr2;
	}

	public void setSt_vsinierr2(String st_vsinierr2) {
		this.st_vsinierr2 = st_vsinierr2;
	}

	public String getSt_metfeerr1() {
		return st_metfeerr1;
	}

	public void setSt_metfeerr1(String st_metfeerr1) {
		this.st_metfeerr1 = st_metfeerr1;
	}

	public String getSt_metfeerr2() {
		return st_metfeerr2;
	}

	public void setSt_metfeerr2(String st_metfeerr2) {
		this.st_metfeerr2 = st_metfeerr2;
	}



	@Override
	public String toString() {
		return "Planet{" +
						"id=" + id +
						", pl_name='" + pl_name + '\'' +
						", pl_disc=" + pl_disc +
						'}';
	}
}
