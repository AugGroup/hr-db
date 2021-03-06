package com.aug.hrdb.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="MAS_JOBLEVEL")
public class MasJobLevel extends BaseEntity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="NAME" ,nullable = false)
	private String name;
	
	@Column(name = "CODE" ,nullable = false)
	private String code;
	
	@Column(name = "ISACTIVE" ,nullable = false)
	private Boolean isActive;
	
	@Column(name = "TAG")
	private String tag;
	
	@Column(name = "TAG_DIVISION")
	private String tagDivision;

	@JsonIgnore
	@OneToMany(mappedBy="jobLevel",fetch=FetchType.LAZY)
	private List<Applicant> applicants;
	
	@JsonIgnore
	@OneToMany(mappedBy="masJobLevel",fetch=FetchType.LAZY)
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTagDivision() {
		return tagDivision;
	}

	public void setTagDivision(String tagDivision) {
		this.tagDivision = tagDivision;
	}

	public List<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public List<CareerCase> getCareerCases() {
		return careerCases;
	}

	public void setCareerCases(List<CareerCase> careerCases) {
		this.careerCases = careerCases;
	}

}