package com.aug.hrdb.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.Applicant;
import com.aug.hrdb.entities.Card;
import com.aug.hrdb.entities.Employee;
import com.aug.hrdb.entities.MasDivision;
import com.aug.hrdb.entities.MasJobLevel;
import com.aug.hrdb.entities.MasTechnology;
import com.aug.hrdb.entities.Punish;
import com.aug.hrdb.services.ApplicantService;
import com.aug.hrdb.services.CardService;
import com.aug.hrdb.services.EmployeeService;
import com.aug.hrdb.services.MasDivisionService;
import com.aug.hrdb.services.MasJobLevelService;
import com.aug.hrdb.services.MasTechnologyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-bean-db-test.xml" })
@Transactional
public class CardServiceTest {
	
	@Autowired
	private CardService cardService;
	@Autowired 
	private EmployeeService employeeService;
	@Autowired 
	private MasJobLevelService masJoblevelService;
	@Autowired 
	private ApplicantService applicantService;
	@Autowired 
	private MasDivisionService masDivisionService;
	@Autowired 
	private MasTechnologyService masTechnologyService;
	
	private	 Employee employee;
	int id;
	int empId;
	int masjobId;
	int appId; 
	int mastecId;
	
	
	@Before
	public void setCard() {
		employee = new Employee();
		/*employee.setIdCard("115310905001-9");
        employee.setNameThai("ธัญลักษณ์์");
        employee.setNameEng("thanyalak");
        employee.setNicknameThai("กิ๊ก");
        employee.setNicknameEng("kik");
        employee.setSurnameThai("พิมสวรรค์");
        employee.setSurnameEng("Pimsawan");*/
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	String dateInString = "31-08-1982";
    	Date date = null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		/*employee.setDateOfBirth(date);
        employee.setEmail("test@gmail.com");
        employee.setEmergencyContact("mom");*/
        employee.setEmployeeCode("EMP-31");
        employee.setStatusemp("Employee");
        employee.setTelHome("089-0851022");
        /*employee.setTelMobile("089-0851022");
        employee.setEmergencyContactPhoneNumber("089-085-1022");*/
        employee.setAuditFlag("C");
        employee.setCreatedBy(1);
        employee.setCreatedTimeStamp(Calendar.getInstance().getTime());
        
        MasTechnology masTechnology = new MasTechnology();
		masTechnology.setName("java");
		masTechnology.setCode("001A");
		masTechnology.setIsActive(true);
		masTechnology.setAuditFlag("C");
		masTechnology.setCreatedBy(0);
		Calendar cal = Calendar.getInstance();
		masTechnology.setCreatedTimeStamp(cal.getTime());
		masTechnologyService.create(masTechnology);
		mastecId = masTechnology.getId();
		MasTechnology mTechnology = masTechnologyService.find(mastecId);

		MasJobLevel masJoblevel = new MasJobLevel();
		masJoblevel.setName("CEO");
		masJoblevel.setIsActive(true);
		masJoblevel.setCode("01");
		masJoblevel.setAuditFlag("C");
		masJoblevel.setCreatedBy(1);
		masJoblevel.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masJoblevel.setCode("Division-01");

		masJoblevelService.create(masJoblevel);
		masjobId = masJoblevel.getId();
		MasJobLevel mJob = masJoblevelService.findById(masjobId);
         			
        
        
        Applicant applicant = new Applicant();
		applicant.setCreatedBy(1);
		applicant.setCreatedTimeStamp(Calendar.getInstance().getTime());
		applicant.setAuditFlag("C");
		applicant.setCardId("115310905001-9");
		applicant.setTechnology(mTechnology);
		applicant.setJoblevel(mJob);
		applicantService.create(applicant);
		appId=applicant.getId();
		
        Applicant applicant1 = applicantService.findById(appId);
        Hibernate.initialize(applicant1);
        
        
        employee.setApplicant(applicant1);
         

	
		MasDivision masDivision = new MasDivision();
		masDivision.setName("CEO");
		masDivision.setIsActive(true);
		masDivision.setCode("01");
		masDivision.setAuditFlag("C");
		masDivision.setCreatedBy(1);
		masDivision.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masDivision.setCode("Division-01");
		
		masDivisionService.create(masDivision);
		masDivisionService.findById(1);
		
		employee.setMasDivision(masDivision);	
		//employee.setMasJoblevel(mJob);
		employeeService.create(employee);
		empId=employee.getId();
		
		
	
		Employee employee =employeeService.findById(1);	   
		Card card=new Card();
		employee.setId(1);		
		card.setEmployee(employee);	
//		Calendar cal = Calendar.getInstance();
		card.setCard_no("111");
		card.setStartdate(cal.getTime());
		card.setEnddate(cal.getTime());
		card.setStatus("yes");
		card.setRemark("aaa");
		card.setAuditFlag("C");
		card.setCreatedBy(0);
		card.setCreatedTimeStamp(cal.getTime());
		cardService.create(card);
		
		
	    id = card.getId();
	    System.out.println("id: "+id);
	
	}
	
	
	
	@Test
	@Rollback(true)
	public void createDataCard(){
		
		Employee employee= employeeService.findById(1);	
		Card card = new Card();
		employee.setId(1);		
		card.setEmployee(employee);		
		card.setCard_no("111");
		Calendar cal = Calendar.getInstance();
		card.setStartdate(cal.getTime());
		card.setEnddate(cal.getTime());
		card.setStatus("yes");
		card.setRemark("aaa");
		card.setAuditFlag("C");
		card.setCreatedBy(0);
		card.setCreatedTimeStamp(cal.getTime());
		cardService.create(card);
	}
	
	
	
	@Test
	@Rollback(true)
	public void updateCard(){
		
		Card card = (Card)cardService.findById(id);
		card.setStatus("no");
		card.setRemark("bbbb");
		cardService.update(card);
	}
	
	
	
	@Test
	@Rollback(true)
	public void deleteDataCard(){
		Card card=cardService.findById(id);
		cardService.delete(card);
	}

	
	
	@Test
	public void findAllDataCard(){

		List<Card> card = cardService.findAll();
//		Assert.assertEquals(3, card.size());
	}
	
	
	
	
	@Test
	public void findDatabyIdCard(){

		Card card =(Card) cardService.findById(id);
		int id = card.getId();
		Assert.assertEquals(id,id);
		
			
	}
	

}


