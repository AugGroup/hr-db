package com.aug.hrdb.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aug.hrdb.dto.ExperienceDto;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "EXPERIENCE")
public class Experience extends BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "APPLICANT_ID")
  private Applicant applicant;

  @Column(name = "ADDRESS")
  private String address;

  @Column(name = "TYPE_OF_BUSINESS")
  private String typeOfBusiness;

  @Column(name = "COMPANY_NAME")
  private String companyName;

  @Column(name = "DATE_FROM")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private Date dateFrom;

  @Column(name = "DATE_TO")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private Date dateTo;

  @Column(name = "POSITION")
  private String position;

  @Column(name = "REASON")
  private String reason;

  @Column(name = "REFERENCE")
  private String reference;

  @Column(name = "RESPONSIBILITY")
  private String responsibility;

  @Column(name = "SALARY")
  private long salary;

  @Column(name = "DATE_WORK")
  private String applyDateStr;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
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

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
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

  public String getApplyDateStr() {
    return applyDateStr;
  }

  public void setApplyDateStr(String applyDateStr) {
    this.applyDateStr = applyDateStr;
  }

  public ExperienceDto toExperienceDto() {
    ExperienceDto experienceDto = new ExperienceDto();
    experienceDto.setId(this.id);
    experienceDto.setDateFrom(this.dateFrom);
    experienceDto.setDateTo(this.dateTo);
    experienceDto.setApplicantId(this.applicant.getId());
    experienceDto.setAddress(this.address);
    experienceDto.setTypeOfBusiness(typeOfBusiness);
    experienceDto.setCompanyName(this.companyName);
    experienceDto.setPosition(this.position);
    experienceDto.setReference(this.reference);
    experienceDto.setResponsibility(this.responsibility);
    experienceDto.setSalary(this.salary);
    experienceDto.setReason(this.reason);

    return experienceDto;

  }

  public Experience fromExperienceDto(Experience experience, ExperienceDto experienceDto) {
    experience.setDateFrom(experienceDto.getDateFrom());
    experience.setDateTo(experienceDto.getDateTo());
    experience.setAddress(experienceDto.getAddress());
    experience.setTypeOfBusiness(experienceDto.getTypeOfBusiness());
    experience.setCompanyName(experienceDto.getCompanyName());
    experience.setPosition(experienceDto.getPosition());
    experience.setReference(experienceDto.getReference());
    experience.setResponsibility(experienceDto.getResponsibility());
    experience.setSalary(experienceDto.getSalary());
    experience.setReason(experienceDto.getReason());

    return experience;

  }

}