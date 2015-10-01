package com.aug.hrdb.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import com.aug.hrdb.entities.Applicant;
import com.aug.hrdb.entities.Login;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.mail.handlers.image_gif;

@Entity
@NamedNativeQueries({
	
	@NamedNativeQuery(name = "FIND_APPOINTMENT", 
			query = "SELECT APPOINTMENT.ID , APPOINTMENT.DETAIL , APPOINTMENT.END , APPOINTMENT.START ,APPOINTMENT.TOPIC ,APPOINTMENT.APPLICANT_ID ,APPOINTMENT.LOGIN_ID  ," +
					"CONCAT(appl.FIRSTNAME_EN,' ',appl.LASTNAME_EN) as APPLICANT_NAME, "+
					"CONCAT(mt.NAME,' ',mj.NAME) as APPLICANT_POSITION , CONCAT(CONCAT(appl.FIRSTNAME_EN,' ',appl.LASTNAME_EN),' ( ',CONCAT(mt.NAME,' ',mj.NAME),' )') as TITLE ,"+
					"null as LOGIN_NAME "+
					"FROM APPOINTMENT " +
					"LEFT JOIN APPLICANT appl on APPOINTMENT.APPLICANT_ID = appl.ID " + 
					"LEFT JOIN MAS_TECHNOLOGY mt ON appl.MASTECHNOLOGY_ID = mt.ID "+
					"LEFT JOIN MAS_JOBLEVEL mj ON appl.MASJOBLEVEL_ID = mj.ID "+
					"LEFT JOIN  LOGIN  on APPOINTMENT.LOGIN_ID = LOGIN.ID " +
					"WHERE DATE(APPOINTMENT.START) >=STR_TO_DATE(:START,'%Y-%m-%d') AND  DATE(APPOINTMENT.END) <= STR_TO_DATE(:END,'%Y-%m-%d')", resultClass = AppointmentDto.class),
	
	@NamedNativeQuery(name = "GET_APPOINTMENT_BY_ID", 
			query = "SELECT appo.ID , appo.DETAIL , appo.END , appo.START ,appo.TOPIC ,appo.APPLICANT_ID ,appo.LOGIN_ID, " +
					"CONCAT(appl.FIRSTNAME_EN,' ',appl.LASTNAME_EN) as APPLICANT_NAME, "+
					"CONCAT(mt.NAME,' ',mj.NAME) as APPLICANT_POSITION ,CONCAT(CONCAT(appl.FIRSTNAME_EN,' ',appl.LASTNAME_EN),' ( '+CONCAT(mt.NAME,' ',mj.NAME)+' )') as TITLE, "+
					"CONCAT(em.NAME_ENG,' ',em.SURNAME_ENG) as LOGIN_NAME "+
					"FROM APPOINTMENT appo " +
					"LEFT JOIN APPLICANT appl on appo.APPLICANT_ID = appl.ID " + 
					"LEFT JOIN MAS_TECHNOLOGY mt ON appl.MASTECHNOLOGY_ID = mt.ID "+
					"LEFT JOIN MAS_JOBLEVEL mj ON appl.MASJOBLEVEL_ID = mj.ID "+
					"LEFT JOIN LOGIN lo on appo.LOGIN_ID = lo.ID " +
					"LEFT JOIN EMPLOYEE em ON em.ID = lo.EMPLOYEE_ID "+
					"WHERE appo.ID = :ID", resultClass = AppointmentDto.class)
})

public class AppointmentDto {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;

	@Column(name = "TOPIC")
	private String topic;
	
	@Column(name = "DETAIL")
	private String detail;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM/dd/yyyy HH:mm:ss z")
	@Column(name = "START")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonSerialize(using = CustomDateSerializer.class)
  //  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date start;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM/dd/yyyy HH:mm:ss z")
	@Column(name = "END")
	@Temporal(TemporalType.TIMESTAMP)
  //  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date end;
	
	@Column(name= "APPLICANT_ID")
	private Integer applicantId;
	
	@Column(name = "LOGIN_ID")
	private Integer loginId;

	@Column(name = "APPLICANT_NAME")
	private String applicantName;
	
	@Column(name = "APPLICANT_POSITION")
	private String applicantPosition;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "LOGIN_NAME")
	private String loginName;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantPosition() {
		return applicantPosition;
	}

	public void setApplicantPosition(String applicantPosition) {
		this.applicantPosition = applicantPosition;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	
}