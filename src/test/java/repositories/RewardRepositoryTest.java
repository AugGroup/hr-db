package repositories;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.Hibernate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.Applicant;
import com.aug.hrdb.entities.Employee;
import com.aug.hrdb.entities.MasDivision;
import com.aug.hrdb.entities.MasJoblevel;
import com.aug.hrdb.entities.Reward;
import com.aug.hrdb.repositories.ApplicantRepository;
import com.aug.hrdb.repositories.EmployeeRepository;
import com.aug.hrdb.repositories.MasDivisionRepository;
import com.aug.hrdb.repositories.MasJoblevelRepository;
import com.aug.hrdb.repositories.RewardRepository;

import junit.framework.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-bean-db-test.xml" })
@Transactional
public class RewardRepositoryTest {
	
	@Autowired
	private RewardRepository rewardRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private MasJoblevelRepository masJoblevelRepository;
	@Autowired
	private ApplicantRepository applicantRepository;
	@Autowired
	private MasDivisionRepository masDivisionRepository;
	private Employee employee1;
	
	Employee employee;
	@Before
//	@Rollback(true)
	public void setReward() {
		employee = new Employee();
        employee.setIdCard("115310905001-9");
        employee.setNameThai("อภิวาท์");
        employee.setNameEng("apiva");
        employee.setNicknameThai("va");
        employee.setNicknameEng("va");
        employee.setSurnameThai("กิมเกถนอม");
        employee.setSurnameEng("kimkatanom");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	String dateInString = "31-08-1982";
    	Date date = null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		employee.setDateOfBirth(date);
        employee.setEmail("test@gmail.com");
        employee.setEmergencyContact("mom");
        employee.setEmployeeCode("EMP-01");
        employee.setStatusemp("Employee");
        employee.setTelHome("089-0851022");
        employee.setTelMobile("089-0851022");
        employee.setEmergencyContactPhoneNumber("089-085-1022");
        employee.setAuditFlag("C");
        employee.setCreatedBy(1);
        employee.setCreatedTimeStamp(Calendar.getInstance().getTime());
        
        Applicant applicant = new Applicant();
		applicant.setCreatedBy(1);
		applicant.setCreatedTimeStamp(Calendar.getInstance().getTime());
		applicant.setAuditFlag("C");
		applicant.setCardId("115310905001-9");
		applicant.setAuditFlag("1");
		applicantRepository.create(applicant);
		
        Applicant applicant1 = applicantRepository.find(1);
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
		
		masDivisionRepository.create(masDivision);
		masDivisionRepository.find(1);
		employee.setMasDivision(masDivision);
		

		MasJoblevel masJoblevel = new MasJoblevel();
		masJoblevel.setName("CEO");
		masJoblevel.setIsActive(true);
		masJoblevel.setCode("01");
		masJoblevel.setAuditFlag("C");
		masJoblevel.setCreatedBy(1);
		masJoblevel.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masJoblevel.setCode("Division-01");

		masJoblevelRepository.create(masJoblevel);
		masJoblevelRepository.find(1);
		
		employee.setMasJoblevel(masJoblevel);
		
		
		employeeRepository.create(employee);
		
		
	    employee1 =  employeeRepository.find(1);
		Reward reward=new Reward();
		reward.setEmployee(employee1);     	
		reward.setTypereward("aa");
		reward.setYear("1991");
		reward.setReason("reason");
		Calendar cal = Calendar.getInstance();
		reward.setAuditFlag("C");
		reward.setCreatedBy(0);
		reward.setCreatedTimeStamp(cal.getTime());
		rewardRepository.create(reward);
		
		
		
	
		
	}
	
	
	/*
	@Test
	@Rollback(false) save จริง
	public void createReward(){
		
		Employee employee =  employeeRepository.find(1);
		Reward reward=new Reward();
		employee.setId(2);
		reward.setEmployee(employee);     	
		reward.setTypereward("aa");
		reward.setYear("1991");
		reward.setReason("reason");
		Calendar cal = Calendar.getInstance();
		reward.setAuditFlag("C");
		reward.setCreatedBy(0);
		reward.setCreatedTimeStamp(cal.getTime());
		rewardRepository.create(reward);
	}
	*/
	
	
	
	@Test
	@Rollback(true)
	public void updateReward(){
		
		Reward reward = (Reward) rewardRepository.getCurrentSession().get(Reward.class,1);	  
		reward.setTypereward("bb");
		reward.setYear("1992");
		reward.setReason("reason");
		Calendar cal = Calendar.getInstance();
		reward.setAuditFlag("C");
		reward.setCreatedBy(0);
		reward.setCreatedTimeStamp(cal.getTime());
		rewardRepository.update(reward);
	}
	
	
	
	@Test
	@Rollback(true)
	public void deleteReward(){
		
		Reward reward = rewardRepository.find(1);
		rewardRepository.delete(reward);
	}
	
	
	
		
	
	
	/*@Test
	public void findByIdReward(){
		
		Reward reward = (Reward) rewardRepository.getCurrentSession().get(Reward.class, 2);		
		int id = reward.getId();
		Assert.assertEquals(1, id);
		
	}*/
	

}
