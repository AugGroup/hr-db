package com.aug.hrdb.dto;

import java.util.Date;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.aug.hrdb.entities.Applicant;
import com.aug.hrdb.entities.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;

@NamedNativeQueries({
		@NamedNativeQuery(name = "SEARCH_EXPERIENCE", query = "SELECT exp.id, exp.address, exp.typeOfBusiness, "
				+ "exp.dateFrom, exp.dateTo, exp.position, exp.reason, exp.reference, exp.responsibility, exp.salary "
				+ "FROM EXPERIENCE exp LEFT JOIN APPLICANT a on exp.APPLICANT_ID = a.APPLICANT_ID WHERE exp.APPLICANT_ID = :ID", resultClass = ExperienceDto.class),

		@NamedNativeQuery(name = "SEARCH_EXPERIENCE_ID", query = "SELECT exp.id, exp.address, exp.typeOfBusiness, "
				+ "exp.dateFrom, exp.dateTo, exp.position, exp.reason, exp.reference, exp.responsibility, exp.salary "
				+ "FROM EXPERIENCE exp WHERE exp.id = :ID", resultClass = ExperienceDto.class),

		@NamedNativeQuery(name = "searchExperience", query = "SELECT exp.id, exp.address, exp.typeOfBusiness, "
				+ "exp.dateFrom, exp.dateTo, exp.position, exp.reason, exp.reference, exp.responsibility, exp.salary "
				+ "emp.employee_code FROM EXPERIENCE as exp, EMPLOYEE as emp "
				+ "WHERE exp.employee_id=:empId AND emp.id = exp.employee_id", resultClass = ExperienceDto.class) })
public class ExperienceDto {
	
	private Applicant applicant;
	
	private Employee employee;

	private Integer id;

	private String address;

	private String typeOfBusiness;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "en", timezone = "GMT")
	private Date dateFrom;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "en", timezone = "GMT")
	private Date dateTo;

	private String position;

	private String reason;

	private String reference;

	private String responsibility;

	private long salary;

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
