/**
 * @author Pranrajit
 * @date 9 มิ.ย. 2558
 */
package com.aug.hrdb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
  @NamedNativeQuery(
    name = "reportLeave",
    query = "select emp.id, emp.employee_code as employeeCode,DATE_FORMAT(app.BIRTHDATE,'%d-%m-%Y') as dateOfBirth, "
      + "TIMESTAMPDIFF(YEAR, app.BIRTHDATE, now() ) as yearAge, "
      + "TIMESTAMPDIFF(MONTH, app.BIRTHDATE, now() ) % 12 as monthAge, "
      + "FLOOR(TIMESTAMPDIFF( DAY, app.BIRTHDATE, now() ) % 30.4375 ) as dayAge, "
      + "app.age as age,app.FIRSTNAME_TH as nameThai,app.FIRSTNAME_EN as nameEng,app.LASTNAME_EN as lastEng,l.sumTime as sumTime,DATE_FORMAT(off.START_WORK_DATE,'%d-%m-%Y') as startWorkDate, "
      + "FLOOR(TIMESTAMPDIFF( DAY,off.start_work_date, now() ) % 30.4375 ) as dayWork, "
      + "TIMESTAMPDIFF(MONTH, off.start_work_date, now() ) % 12 as monthWork, "
      + "TIMESTAMPDIFF(YEAR, off.start_work_date, now() ) as yearWork, "
      + "SUM( CASE when l.leavetype_id= 1 then (l.sumTime/8) else 0 end) as 'dayAnnual', "
      + "SUM( CASE when l.leavetype_id= 3 then (l.sumTime/8) else 0 end) as 'dayPersonal', "
      + "SUM( CASE when l.leavetype_id= 4 then (l.sumTime/8) else 0 end) as 'daySick', "
      + "SUM((CASE when l.leavetype_id= 4 then (l.sumTime/8) else 0 end)+(CASE when l.leavetype_id= 3 then (l.sumTime/8)else 0 end)+ "
      + "(CASE when l.leavetype_id= 1 then (l.sumTime/8) else 0 end )) as totalDayLeave "
      + "from employee emp "
      + "join applicant as app on emp.applicant_id = app.id "
      + "join official off on app.OFFICIAL_ID=off.ID "
      + "join leaves as l "
      + "on emp.id = l.employee_id "
      + "where app.FIRSTNAME_EN  like :name "
      + "group by emp.employee_code",
    resultClass = ReportLeaveDto.class)
})

@Entity
public class ReportLeaveDto {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "employeeCode")
  private String employeeCode;

  @Column(name = "dateOfBirth")
  private String dateOfBirth;

  @Column(name = "nameEng")
  private String nameEng;

  @Column(name = "lastEng")
  private String lastEng;

  @Column(name = "nameThai")
  private String nameThai;

  @Column(name = "age")
  private Integer age;

  @Column(name = "startWorkDate")
  private String startWorkDate;

  @Column(name = "dayWork")
  private Integer dayWork;

  @Column(name = "monthWork")
  private Integer monthWork;

  @Column(name = "yearWork")
  private Integer yearWork;

  @Column(name = "dayAge")
  private Integer dayAge;

  @Column(name = "monthAge")
  private Integer monthAge;

  @Column(name = "yearAge")
  private Integer yearAge;

  @Column(name = "dayAnnual")
  private Float dayAnnual;

  @Column(name = "daySick")
  private Float daySick;

  @Column(name = "dayPersonal")
  private Float dayPersonal;

  @Column(name = "totalDayLeave")
  private Float totalDayLeave;

  @Column(name = "sumtime")
  private Float sumTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmployeeCode() {
    return employeeCode;
  }

  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getNameEng() {
    return nameEng;
  }

  public void setNameEng(String nameEng) {
    this.nameEng = nameEng;
  }

  public String getLastEng() {
    return lastEng;
  }

  public void setLastEng(String lastEng) {
    this.lastEng = lastEng;
  }

  public String getNameThai() {
    return nameThai;
  }

  public void setNameThai(String nameThai) {
    this.nameThai = nameThai;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getStartWorkDate() {
    return startWorkDate;
  }

  public void setStartWorkDate(String startWorkDate) {
    this.startWorkDate = startWorkDate;
  }

  public Integer getDayWork() {
    return dayWork;
  }

  public void setDayWork(Integer dayWork) {
    this.dayWork = dayWork;
  }

  public Integer getMonthWork() {
    return monthWork;
  }

  public void setMonthWork(Integer monthWork) {
    this.monthWork = monthWork;
  }

  public Integer getYearWork() {
    return yearWork;
  }

  public void setYearWork(Integer yearWork) {
    this.yearWork = yearWork;
  }

  public Integer getDayAge() {
    return dayAge;
  }

  public void setDayAge(Integer dayAge) {
    this.dayAge = dayAge;
  }

  public Integer getMonthAge() {
    return monthAge;
  }

  public void setMonthAge(Integer monthAge) {
    this.monthAge = monthAge;
  }

  public Integer getYearAge() {
    return yearAge;
  }

  public void setYearAge(Integer yearAge) {
    this.yearAge = yearAge;
  }

  public Float getDayAnnual() {
    return dayAnnual;
  }

  public void setDayAnnual(Float dayAnnual) {
    this.dayAnnual = dayAnnual;
  }

  public Float getDaySick() {
    return daySick;
  }

  public void setDaySick(Float daySick) {
    this.daySick = daySick;
  }

  public Float getDayPersonal() {
    return dayPersonal;
  }

  public void setDayPersonal(Float dayPersonal) {
    this.dayPersonal = dayPersonal;
  }

  public Float getTotalDayLeave() {
    return totalDayLeave;
  }

  public void setTotalDayLeave(Float totalDayLeave) {
    this.totalDayLeave = totalDayLeave;
  }

  public Float getSumTime() {
    return sumTime;
  }

  public void setSumTime(Float sumTime) {
    this.sumTime = sumTime;
  }

}