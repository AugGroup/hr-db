package com.aug.hrdb.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "MAS_SPECIALTY")
public class MasSpecialty extends BaseEntity{
	
	@Id @GeneratedValue @Column(name="ID")
	private Integer id;

	@Column(name = "NAME" ,nullable = false)
	private String name;
	
	@Column(name = "CODE" ,nullable = false)
	private String code;
	
	@Column(name = "ISACTIVE")
	private Boolean isActive;
	
	@JsonIgnore
	@OneToMany(mappedBy = "masspecialty")
	private List<Ability> abilities;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "masSpecialties")
	private List<CareerCase> careerCases;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public List<CareerCase> getCareerCases() {
		return careerCases;
	}

	public void setCareerCases(List<CareerCase> careerCases) {
		this.careerCases = careerCases;
	}
	
}