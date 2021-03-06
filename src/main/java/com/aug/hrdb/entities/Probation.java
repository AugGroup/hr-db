package com.aug.hrdb.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.aug.hrdb.dto.ProbationDto;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PROBATION")
public class Probation extends BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Integer id;

  @Column(name = "DATE_FROM", nullable = false)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateFrom;

  @Column(name = "DATE_TO", nullable = false)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateTo;

  @Column(name = "STATUS", nullable = false)
  private String status;

  @Column(name = "REASON")
  private String reason;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
  private Employee employee;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ProbationDto toProbationDto() {
    ProbationDto probationDto = new ProbationDto();
    probationDto.setId(this.id);
    probationDto.setDateFrom(this.dateFrom);
    probationDto.setDateTo(this.dateTo);
    probationDto.setEmployeeCode(this.employee.getEmployeeCode());
    probationDto.setEmployeeId(this.employee.getId());
    probationDto.setStatus(this.status);
    probationDto.setReason(this.reason);

    return probationDto;

  }

  public Probation fromProbationDto(Probation probation, ProbationDto probationDto) {
    probation.setDateFrom(probationDto.getDateFrom());
    probation.setDateTo(probationDto.getDateTo());
    probation.setStatus(probationDto.getStatus());
    probation.setReason(probationDto.getReason());
    Employee employee = new Employee();
    employee.setId(probationDto.getEmployeeId());
    probation.setEmployee(employee);

    return probation;

  }

}