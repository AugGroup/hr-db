/**
 * @author Pranrajit
 * @date 19 พ.ค. 2558
 */
package com.aug.hrdb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
  @NamedNativeQuery(
    name = "searchAbility",
    query = "select ability.id, "
      + "ability.rank, "
      + "mas_specialty.name, "
      + "ability.applicant_id,"
      + "mas_specialty.id as SPEC_ID "
      + "from ability, mas_specialty "
      + "WHERE ability.APPLICANT_ID=:ID and ability.specialty_id = mas_specialty.id",
    resultClass = AbilityDto.class),
  @NamedNativeQuery(
    name = "SEARCH_ABILITY_ID",
    query = "SELECT ab.ID, "
      + "ab.RANK, ms.NAME, ab.APPLICANT_ID, ms.ID as SPEC_ID "
      + "FROM ability ab "
      + "JOIN mas_specialty ms ON ab.SPECIALTY_ID = ms.ID "
      + "JOIN applicant a ON a.ID = ab.APPLICANT_ID WHERE ab.ID=:ID",
    resultClass = AbilityDto.class),
  @NamedNativeQuery(
    name = "SEARCH_SPACIALTY_ID",
    query = "SELECT ab.ID, "
    + "ab.RANK, ab.APPLICANT_ID, ab.SPECIALTY_ID, ms.NAME, ms.ID as SPEC_ID "
    + "FROM ability ab JOIN mas_specialty ms ON ms.ID = ab.SPECIALTY_ID "
    + "WHERE ab.APPLICANT_ID =:ID AND ab.SPECIALTY_ID=:SP_ID",
    resultClass = AbilityDto.class)
})

@Entity
public class AbilityDto {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "RANK", nullable = false)
  private Integer rank;

  @Column(name = "NAME")
  private String masspecialty;

  @Column(name = "SPEC_ID")
  private Integer masspecialtyId;

  @Column(name = "APPLICANT_ID")
  private Integer applicantId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public String getMasspecialty() {
    return masspecialty;
  }

  public void setMasspecialty(String masspecialty) {
    this.masspecialty = masspecialty;
  }

  public Integer getMasspecialtyId() {
    return masspecialtyId;
  }

  public void setMasspecialtyId(Integer masspecialtyId) {
    this.masspecialtyId = masspecialtyId;
  }

  public Integer getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(Integer applicantId) {
    this.applicantId = applicantId;
  }

}
