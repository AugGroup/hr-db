package com.aug.hrdb.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="FAMILY")
public class Family extends BaseEntity implements Serializable {

	
	private static final long serialVersionUID = -5187864989377656419L;
	private Integer id; 
	private String name;
	private String gender;
	private Integer age;
	private String mobile;
	private String address;
	private String occupation; 
	private String position; 
	//private Employee employee;
	private MasRelationType masRelationType;
	
	
	@Id
	@GeneratedValue
	@Column(name="ID",length=6)
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}

	
	
	@Column(name="NAME")	
	@NotNull
	@NotEmpty
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Column(name="GENDER",length=10)
	@NotNull
	@NotEmpty
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Column(name="AGE",length=3)
	@NotNull
	public Integer getAge() {
		return age;
	}
	
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	@Column(name="TELEPHONE",length=12)
	@NotNull
	@NotEmpty
	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	@Column(name="ADDRESS")
	@NotNull
	@NotEmpty
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Column(name="OCCUPATION")
	public String getOccupation() {
		return occupation;
	}
	
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	@Column(name="POSITION")
	public String getPosition() {
		return position;
	}
	
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	
   
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MASRELATION_ID",nullable=false)
	public MasRelationType getMasRelation() {
		return masRelationType;
	}


	public void setMasRelation(MasRelationType masRelation) {
		this.masRelationType = masRelation;
	}
	
	
    /*@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EMPLOYEE_ID",nullable=false)
	public Employee getEmployee() {
		return employee;
	}

	

	public void setEmployee(Employee employee){
		this.employee = employee;
	}*/

}