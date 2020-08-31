package com.lynch.exoplanet.planet;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Data from NASA Planetary Systems Composite Parameters Table
 *
 *
 *
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "planetarysystemstable")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/*
	 * Names (Verified 8/18/20)
	 */

	@Column(name = "pl_name")
	private String pl_name;

	@Column(name = "hostname")
	private String hostname;

	@Column(name = "pl_letter")
	private String pl_letter;

	@Column(name = "hd_name")
	private String hd_name;

	@Column(name = "hip_name")
	private String hip_name;

	@Column(name = "tic_id")
	private String tic_id;

	@Column(name = "gaia_id")
	private String gaia_id;

	/*
	 * System Composition (Verified 8/18/20)
	 */

	@Column(name = "sy_snum")
	private Integer sy_snum;

	@Column(name = "sy_pnum")
	private Integer sy_pnum;

	@Column(name = "cb_flag")
	private Integer cb_flag;


	/*
	 * Planet Discovery (Verified 8/18/20)
	 */

	@Column(name = "discoverymethod")
	private String discoverymethod;

	@Column(name = "disc_year")
	private Integer disc_year;

	@Column(name = "disc_locale")
	private String disc_locale;

	@Column(name = "disc_facility")
	private String disc_facility;

	@Column(name = "disc_telescope")
	private String disc_telescope;

	@Column(name = "disc_instrument")
	private String disc_instrument;


	/*
	 * Detections (Verified 8/18/20)
	 */

	@Column(name = "ima_flag")
	private Integer ima_flag;

	/*
	 * Planet Parameters (Verified 8/18/20)
	 */

	@Column(name = "pl_orbper")
	private Double pl_orbper;

	@Column(name = "pl_orbsmax")
	private Double pl_orbsmax;

	@Column(name = "pl_rade")
	private Double pl_rade;

	@Column(name = "pl_radj")
	private Double pl_radj;


	@Column(name = "pl_bmasse")
	private Double pl_bmasse;

	@Column(name = "pl_bmassj")
	private Double pl_bmassj;

	@Column(name = "pl_bmassprov")
	private String pl_bmassprov;

	@Column(name = "pl_dens")
	private Double pl_dens;

	@Column(name = "pl_orbeccen")
	private Double pl_orbeccen;

	@Column(name = "pl_insol")
	private Double pl_insol;

	@Column(name = "pl_eqt")
	private Double pl_eqt;

	@Column(name = "pl_orbincl")
	private Double pl_orbincl;

	@Column(name = "pl_tranmid")
	private Double pl_tranmid;

	@Column(name = "pl_trandep")
	private Double pl_trandep;

	@Column(name = "pl_trandur")
	private Double pl_trandur;

	@Column(name = "pl_ratdor")
	private Double pl_ratdor;

	@Column(name = "pl_ratror")
	private Double pl_ratror;

	/*
	 * Stellar Data (Verified 8/18/20)
	 */

	@Column(name = "st_spectype")
	private String st_spectype;

	@SuppressWarnings("JpaDataSourceORMInspection")
	@Column(name = "st_teff")
	private Double st_teff;

	@Column(name = "st_rad")
	private Double st_rad;

	@Column(name = "st_mass")
	private Double st_mass;

	@Column(name = "st_met")
	private Double st_met;

	@Column(name = "st_metratio")
	private String st_metratio;

	@Column(name = "st_lum")
	private Double st_lum;

	@Column(name = "st_logg")
	private Double st_logg;

	@Column(name = "st_age")
	private Double st_age;

	@Column(name = "st_dens")
	private Double st_dens;

	@Column(name = "st_vsin")
	private Double st_vsin;

	@Column(name = "st_rotp")
	private Double st_rotp;

	@Column(name = "st_radv")
	private Double st_radv;


	/*
	 * System Data (Verified 8/19/20)
	 */

	@Column(name = "sy_dist")
	private Double sy_dist;


	/*
	 * Position Data (Verified 8/19/20)
	 */

	@Column(name = "ra")
	private Double ra;

	@Column(name = "dec")
	private Double dec;

	@Column(name = "glon")
	private Double glon;

	@Column(name = "glat")
	private Double glat;


	/*
	 * Photometry
	 */

	@Column(name = "sy_bmag")
	private Double sy_bmag;

	@Column(name = "sy_vmag")
	private Double sy_vmag;

	@Column(name = "sy_jmag")
	private Double sy_jmag;

	@Column(name = "sy_hmag")
	private Double sy_hmag;

	@Column(name = "sy_kmag")
	private Double sy_kmag;

	@Column(name = "sy_w1mag")
	private Double sy_w1mag;

	@Column(name = "sy_w2mag")
	private Double sy_w2mag;

	@Column(name = "sy_w3mag")
	private Double sy_w3mag;

	@Column(name = "sy_w4mag")
	private Double sy_w4mag;

	@Column(name = "sy_umag")
	private Double sy_umag;

	@Column(name = "sy_gmag")
	private Double sy_gmag;

	@Column(name = "sy_rmag")
	private Double sy_rmag;

	@Column(name = "sy_imag")
	private Double sy_imag;

	@Column(name = "sy_zmag")
	private Double sy_zmag;

	@Column(name = "sy_kepmag")
	private Double sy_kepmag;

	/*
	 * System Error Fields
	 */

	@Column(name = "sy_disterr1")
	private String sy_disterr1;

	@Column(name = "sy_disterr2")
	private String sy_disterr2;

	/*
	 * Star Error Fields
	 */

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

	@Column(name = "st_radverr1")
	private String st_radverr1;

	@Column(name = "st_radverr2")
	private String st_radverr2;

	@Column(name = "st_vsinerr1")
	private String st_vsinerr1;

	@Column(name = "st_vsinerr2")
	private String st_vsinerr2;

	@Column(name = "st_meterr1")
	private String st_meterr1;

	@Column(name = "st_meterr2")
	private String st_meterr2;

	@Column(name = "st_lumerr1")
	private String st_lumerr1;

	@Column(name = "st_lumerr2")
	private String st_lumerr2;

	@Column(name = "st_ageerr1")
	private String st_ageerr1;

	@Column(name = "st_ageerr2")
	private String st_ageerr2;

	/*
	 * Planet Error Fields
	 */

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

	@Column(name = "pl_insolerr1")
	private String pl_insolerr1;

	@Column(name = "pl_insolerr2")
	private String pl_insolerr2;


	/*
	 * Photometry Error Fields
	 */

	@Column(name = "sy_bmagerr1")
	private Double sy_bmagerr1;

	@Column(name = "sy_vmagerr1")
	private Double sy_vmagerr1;

	@Column(name = "sy_jmagerr1")
	private Double sy_jmagerr1;

	@Column(name = "sy_hmagerr1")
	private Double sy_hmagerr1;

	@Column(name = "sy_kmagerr1")
	private Double sy_kmagerr1;

	@Column(name = "sy_w1magerr1")
	private Double sy_w1magerr1;

	@Column(name = "sy_w2magerr1")
	private Double sy_w2magerr1;

	@Column(name = "sy_w3magerr1")
	private Double sy_w3magerr1;

	@Column(name = "sy_w4magerr1")
	private Double sy_w4magerr1;

	@Column(name = "sy_umagerr1")
	private Double sy_umagerr1;

	@Column(name = "sy_gmagerr1")
	private Double sy_gmagerr1;

	@Column(name = "sy_rmagerr1")
	private Double sy_rmagerr1;

	@Column(name = "sy_imagerr1")
	private Double sy_imagerr1;

	@Column(name = "sy_zmagerr1")
	private Double sy_zmagerr1;

	@Column(name = "sy_kepmagerr1")
	private Double sy_kepmagerr1;

	@Column(name = "sy_bmagerr2")
	private Double sy_bmagerr2;

	@Column(name = "sy_vmagerr2")
	private Double sy_vmagerr2;

	@Column(name = "sy_jmagerr2")
	private Double sy_jmagerr2;

	@Column(name = "sy_hmagerr2")
	private Double sy_hmagerr2;

	@Column(name = "sy_kmagerr2")
	private Double sy_kmagerr2;

	@Column(name = "sy_w1magerr2")
	private Double sy_w1magerr2;

	@Column(name = "sy_w2magerr2")
	private Double sy_w2magerr2;

	@Column(name = "sy_w3magerr2")
	private Double sy_w3magerr2;

	@Column(name = "sy_w4magerr2")
	private Double sy_w4magerr2;

	@Column(name = "sy_umagerr2")
	private Double sy_umagerr2;

	@Column(name = "sy_gmagerr2")
	private Double sy_gmagerr2;

	@Column(name = "sy_rmagerr2")
	private Double sy_rmagerr2;

	@Column(name = "sy_imagerr2")
	private Double sy_imagerr2;

	@Column(name = "sy_zmagerr2")
	private Double sy_zmagerr2;

	@Column(name = "sy_kepmagerr2")
	private Double sy_kepmagerr2;
	
	/*
	 *  Constructor
	 */

	public Planet() {
		// No arg Constructor
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

	public String getPl_name() {
		return pl_name;
	}

	public void setPl_name(String pl_name) {
		this.pl_name = pl_name;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPl_letter() {
		return pl_letter;
	}

	public void setPl_letter(String pl_letter) {
		this.pl_letter = pl_letter;
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

	public String getTic_id() {
		return tic_id;
	}

	public void setTic_id(String tic_id) {
		this.tic_id = tic_id;
	}

	public String getGaia_id() {
		return gaia_id;
	}

	public void setGaia_id(String gaia_id) {
		this.gaia_id = gaia_id;
	}

	public Integer getSy_snum() {
		return sy_snum;
	}

	public void setSy_snum(Integer sy_snum) {
		this.sy_snum = sy_snum;
	}

	public Integer getSy_pnum() {
		return sy_pnum;
	}

	public void setSy_pnum(Integer sy_pnum) {
		this.sy_pnum = sy_pnum;
	}

	public Integer getCb_flag() {
		return cb_flag;
	}

	public void setCb_flag(Integer cb_flag) {
		this.cb_flag = cb_flag;
	}

	public String getDiscoverymethod() {
		return discoverymethod;
	}

	public void setDiscoverymethod(String discoverymethod) {
		this.discoverymethod = discoverymethod;
	}

	public Integer getDisc_year() {
		return disc_year;
	}

	public void setDisc_year(Integer disc_year) {
		this.disc_year = disc_year;
	}

	public String getDisc_locale() {
		return disc_locale;
	}

	public void setDisc_locale(String disc_locale) {
		this.disc_locale = disc_locale;
	}

	public String getDisc_facility() {
		return disc_facility;
	}

	public void setDisc_facility(String disc_facility) {
		this.disc_facility = disc_facility;
	}

	public String getDisc_telescope() {
		return disc_telescope;
	}

	public void setDisc_telescope(String disc_telescope) {
		this.disc_telescope = disc_telescope;
	}

	public String getDisc_instrument() {
		return disc_instrument;
	}

	public void setDisc_instrument(String disc_instrument) {
		this.disc_instrument = disc_instrument;
	}

	public Integer getIma_flag() {
		return ima_flag;
	}

	public void setIma_flag(Integer ima_flag) {
		this.ima_flag = ima_flag;
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

	public Double getPl_rade() {
		return pl_rade;
	}

	public void setPl_rade(Double pl_rade) {
		this.pl_rade = pl_rade;
	}

	public Double getPl_radj() {
		return pl_radj;
	}

	public void setPl_radj(Double pl_radj) {
		this.pl_radj = pl_radj;
	}


	public Double getPl_bmasse() {
		return pl_bmasse;
	}

	public void setPl_bmasse(Double pl_bmasse) {
		this.pl_bmasse = pl_bmasse;
	}

	public Double getPl_bmassj() {
		return pl_bmassj;
	}

	public void setPl_bmassj(Double pl_bmassj) {
		this.pl_bmassj = pl_bmassj;
	}

	public String getPl_bmassprov() {
		return pl_bmassprov;
	}

	public void setPl_bmassprov(String pl_bmassprov) {
		this.pl_bmassprov = pl_bmassprov;
	}

	public Double getPl_dens() {
		return pl_dens;
	}

	public void setPl_dens(Double pl_dens) {
		this.pl_dens = pl_dens;
	}

	public Double getPl_orbeccen() {
		return pl_orbeccen;
	}

	public void setPl_orbeccen(Double pl_orbeccen) {
		this.pl_orbeccen = pl_orbeccen;
	}

	public Double getPl_insol() {
		return pl_insol;
	}

	public void setPl_insol(Double pl_insol) {
		this.pl_insol = pl_insol;
	}

	public Double getPl_eqt() {
		return pl_eqt;
	}

	public void setPl_eqt(Double pl_eqt) {
		this.pl_eqt = pl_eqt;
	}

	public Double getPl_orbincl() {
		return pl_orbincl;
	}

	public void setPl_orbincl(Double pl_orbincl) {
		this.pl_orbincl = pl_orbincl;
	}

	public Double getPl_tranmid() {
		return pl_tranmid;
	}

	public void setPl_tranmid(Double pl_tranmid) {
		this.pl_tranmid = pl_tranmid;
	}

	public Double getPl_trandep() {
		return pl_trandep;
	}

	public void setPl_trandep(Double pl_trandep) {
		this.pl_trandep = pl_trandep;
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

	public String getSt_spectype() {
		return st_spectype;
	}

	public void setSt_spectype(String st_spectype) {
		this.st_spectype = st_spectype;
	}

	public Double getSt_teff() {
		return st_teff;
	}

	public void setSt_teff(Double st_teff) {
		this.st_teff = st_teff;
	}

	public Double getSt_rad() {
		return st_rad;
	}

	public void setSt_rad(Double st_rad) {
		this.st_rad = st_rad;
	}

	public Double getSt_mass() {
		return st_mass;
	}

	public void setSt_mass(Double st_mass) {
		this.st_mass = st_mass;
	}

	public Double getSt_met() {
		return st_met;
	}

	public void setSt_met(Double st_met) {
		this.st_met = st_met;
	}

	public String getSt_metratio() {
		return st_metratio;
	}

	public void setSt_metratio(String st_metratio) {
		this.st_metratio = st_metratio;
	}

	public Double getSt_lum() {
		return st_lum;
	}

	public void setSt_lum(Double st_lum) {
		this.st_lum = st_lum;
	}

	public Double getSt_logg() {
		return st_logg;
	}

	public void setSt_logg(Double st_logg) {
		this.st_logg = st_logg;
	}

	public Double getSt_age() {
		return st_age;
	}

	public void setSt_age(Double st_age) {
		this.st_age = st_age;
	}

	public Double getSt_dens() {
		return st_dens;
	}

	public void setSt_dens(Double st_dens) {
		this.st_dens = st_dens;
	}

	public Double getSt_vsin() {
		return st_vsin;
	}

	public void setSt_vsin(Double st_vsin) {
		this.st_vsin = st_vsin;
	}

	public Double getSt_rotp() {
		return st_rotp;
	}

	public void setSt_rotp(Double st_rotp) {
		this.st_rotp = st_rotp;
	}

	public Double getSt_radv() {
		return st_radv;
	}

	public void setSt_radv(Double st_radv) {
		this.st_radv = st_radv;
	}

	public Double getSy_dist() {
		return sy_dist;
	}

	public void setSy_dist(Double sy_dist) {
		this.sy_dist = sy_dist;
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

	public Double getGlon() {
		return glon;
	}

	public void setGlon(Double glon) {
		this.glon = glon;
	}

	public Double getGlat() {
		return glat;
	}

	public void setGlat(Double glat) {
		this.glat = glat;
	}


	public String getSy_disterr1() {
		return sy_disterr1;
	}

	public void setSy_disterr1(String sy_disterr1) {
		this.sy_disterr1 = sy_disterr1;
	}

	public String getSy_disterr2() {
		return sy_disterr2;
	}

	public void setSy_disterr2(String sy_disterr2) {
		this.sy_disterr2 = sy_disterr2;
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

	public String getSt_vsinerr1() {
		return st_vsinerr1;
	}

	public void setSt_vsinerr1(String st_vsinerr1) {
		this.st_vsinerr1 = st_vsinerr1;
	}

	public String getSt_vsinerr2() {
		return st_vsinerr2;
	}

	public void setSt_vsinerr2(String st_vsinerr2) {
		this.st_vsinerr2 = st_vsinerr2;
	}

	public String getSt_meterr1() {
		return st_meterr1;
	}

	public void setSt_meterr1(String st_meterr1) {
		this.st_meterr1 = st_meterr1;
	}

	public String getSt_meterr2() {
		return st_meterr2;
	}

	public void setSt_meterr2(String st_meterr2) {
		this.st_meterr2 = st_meterr2;
	}

	public String getSt_lumerr1() {
		return st_lumerr1;
	}

	public void setSt_lumerr1(String st_lumerr1) {
		this.st_lumerr1 = st_lumerr1;
	}

	public String getSt_lumerr2() {
		return st_lumerr2;
	}

	public void setSt_lumerr2(String st_lumerr2) {
		this.st_lumerr2 = st_lumerr2;
	}

	public String getSt_ageerr1() {
		return st_ageerr1;
	}

	public void setSt_ageerr1(String st_ageerr1) {
		this.st_ageerr1 = st_ageerr1;
	}

	public String getSt_ageerr2() {
		return st_ageerr2;
	}

	public void setSt_ageerr2(String st_ageerr2) {
		this.st_ageerr2 = st_ageerr2;
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

	public String getPl_insolerr1() {
		return pl_insolerr1;
	}

	public void setPl_insolerr1(String pl_insolerr1) {
		this.pl_insolerr1 = pl_insolerr1;
	}

	public String getPl_insolerr2() {
		return pl_insolerr2;
	}

	public void setPl_insolerr2(String pl_insolerr2) {
		this.pl_insolerr2 = pl_insolerr2;
	}

	public Double getSy_bmag() {
		return sy_bmag;
	}

	public void setSy_bmag(Double sy_bmag) {
		this.sy_bmag = sy_bmag;
	}

	public Double getSy_vmag() {
		return sy_vmag;
	}

	public void setSy_vmag(Double sy_vmag) {
		this.sy_vmag = sy_vmag;
	}

	public Double getSy_jmag() {
		return sy_jmag;
	}

	public void setSy_jmag(Double sy_jmag) {
		this.sy_jmag = sy_jmag;
	}

	public Double getSy_hmag() {
		return sy_hmag;
	}

	public void setSy_hmag(Double sy_hmag) {
		this.sy_hmag = sy_hmag;
	}

	public Double getSy_kmag() {
		return sy_kmag;
	}

	public void setSy_kmag(Double sy_kmag) {
		this.sy_kmag = sy_kmag;
	}

	public Double getSy_w1mag() {
		return sy_w1mag;
	}

	public void setSy_w1mag(Double sy_w1mag) {
		this.sy_w1mag = sy_w1mag;
	}

	public Double getSy_w2mag() {
		return sy_w2mag;
	}

	public void setSy_w2mag(Double sy_w2mag) {
		this.sy_w2mag = sy_w2mag;
	}

	public Double getSy_w3mag() {
		return sy_w3mag;
	}

	public void setSy_w3mag(Double sy_w3mag) {
		this.sy_w3mag = sy_w3mag;
	}

	public Double getSy_w4mag() {
		return sy_w4mag;
	}

	public void setSy_w4mag(Double sy_w4mag) {
		this.sy_w4mag = sy_w4mag;
	}

	public Double getSy_umag() {
		return sy_umag;
	}

	public void setSy_umag(Double sy_umag) {
		this.sy_umag = sy_umag;
	}

	public Double getSy_gmag() {
		return sy_gmag;
	}

	public void setSy_gmag(Double sy_gmag) {
		this.sy_gmag = sy_gmag;
	}

	public Double getSy_rmag() {
		return sy_rmag;
	}

	public void setSy_rmag(Double sy_rmag) {
		this.sy_rmag = sy_rmag;
	}

	public Double getSy_imag() {
		return sy_imag;
	}

	public void setSy_imag(Double sy_imag) {
		this.sy_imag = sy_imag;
	}

	public Double getSy_zmag() {
		return sy_zmag;
	}

	public void setSy_zmag(Double sy_zmag) {
		this.sy_zmag = sy_zmag;
	}

	@Override
	public String toString() {
		return "Planet{" +
						"id=" + id +
						", pl_name='" + pl_name + '\'' +
						", disc_year=" + disc_year +
						'}';
	}
}
