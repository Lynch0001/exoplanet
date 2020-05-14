package com.lynch.exoplanet.planet;

import com.lynch.exoplanet.star.Star;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="planettable")
public class Planet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="pl_hostname")
	private String plHostName;

	@Column(name="pl_name")
	private String plName;

	@ManyToOne
	@JoinColumn(name="star_id", nullable=false, updatable=false)
	@JsonIgnoreProperties("planets")
	private Star star;

	public Planet() {
	}

	public Planet(Long id, String hname, String pname) {
		super();
		this.id = id;
		this.plHostName = plHostName;
		this.plName = plName;
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

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public Star getStar() { return star; }

	
	
}
