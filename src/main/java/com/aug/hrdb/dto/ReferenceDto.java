package com.aug.hrdb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
  @NamedNativeQuery(
    name = "searchReference",
    query = "select ref.id, ref.name, ref.address, ref.telephone, ref.occupation, ref.applicant_id "
      + "from reference as ref inner join employee as emp on emp.id=:empId and ref.applicant_id=emp.applicant_id",
    resultClass = ReferenceDto.class),
  @NamedNativeQuery(
    name = "SEARCH_REFERENCE",
    query = "SELECT r.ID, r.ADDRESS, r.NAME, r.OCCUPATION, r.TELEPHONE, r.APPLICANT_ID"
    + " FROM REFERENCE r LEFT JOIN APPLICANT a on r.APPLICANT_ID = a.ID WHERE r.APPLICANT_ID = :ID",
    resultClass = ReferenceDto.class),

  @NamedNativeQuery(
    name = "SEARCH_REFERENCE_ID",
    query = "select ref.id,ref.name, ref.address, ref.telephone, ref.occupation, ref.applicant_id "
    + " FROM REFERENCE ref WHERE ref.ID =:ID",
    resultClass = ReferenceDto.class)
})
@Entity
public class ReferenceDto {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "ADDRESS")
  private String address;

  @Column(name = "TELEPHONE")
  private String tel;

  @Column(name = "OCCUPATION")
  private String occupation;

  @Column(name = "APPLICANT_ID")
  private Integer applicantId;

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

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Integer getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(Integer applicantId) {
    this.applicantId = applicantId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

}