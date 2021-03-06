package com.aug.hrdb.repositories;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.CareerCase;
import com.aug.hrdb.entities.Client;
import com.aug.hrdb.entities.MasCareerCaseStatus;
import com.aug.hrdb.entities.MasCoreSkill;
import com.aug.hrdb.entities.MasDivision;
import com.aug.hrdb.entities.MasJobLevel;
import com.aug.hrdb.entities.MasTechnology;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-bean-db-test.xml"})
@TransactionConfiguration
@Transactional
public class CareerCaseRepositoryTest {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private CareerCaseRepository careerCaseRepository;
	
	@Autowired
	private MasCareerCaseStatusRepository masCareerCaseStatusRepository;
	
	@Autowired
	private MasCoreSkillRepository masCoreSkillRepository;
	
	@Autowired 
	private MasDivisionRepository masDivisionRepository;
	
	@Autowired
	private MasJobLevelRepository masJobLevelRepository;
	
	@Autowired
	private MasTechnologyRepository masTechnologyRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	private CareerCase careerCase;
	
	@Before
	public void setUp() throws Exception {
		
		MasCareerCaseStatus masCareerCaseStatus = new MasCareerCaseStatus();
		masCareerCaseStatus = new MasCareerCaseStatus();
		masCareerCaseStatus.setName("test career status");
		masCareerCaseStatus.setAuditFlag("C");
		masCareerCaseStatus.setCreatedBy(0);
		masCareerCaseStatus.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masCareerCaseStatusRepository.create(masCareerCaseStatus);
		
		MasCoreSkill masCoreSkill = new MasCoreSkill();
		masCoreSkill = new MasCoreSkill();
		masCoreSkill.setName("test core skill");
		masCoreSkill.setAuditFlag("C");
		masCoreSkill.setCreatedBy(0);
		masCoreSkill.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masCoreSkillRepository.create(masCoreSkill);
		
		MasDivision masDivision = new MasDivision();
		masDivision = new MasDivision();
		masDivision.setName("TEST");
		masDivision.setCode("TEST");
		masDivision.setIsActive(true);
		masDivision.setAuditFlag("C");
		masDivision.setCreatedBy(0);
		masDivision.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masDivisionRepository.create(masDivision);
		
		MasJobLevel masJobLevel = new MasJobLevel();
		masJobLevel = new MasJobLevel();
		masJobLevel.setName("test joblevel");
		masJobLevel.setCode("004A");
		masJobLevel.setIsActive(true);
		masJobLevel.setAuditFlag("C");
		masJobLevel.setCreatedBy(0);
		masJobLevel.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masJobLevelRepository.create(masJobLevel);
		
		MasTechnology masTechnology = new MasTechnology();
		masTechnology = new MasTechnology();
		masTechnology.setName("test technology");
		masTechnology.setCode("004A");
		masTechnology.setIsActive(true);
		masTechnology.setAuditFlag("C");
		masTechnology.setCreatedBy(0);
		masTechnology.setCreatedTimeStamp(Calendar.getInstance().getTime());
		masTechnologyRepository.create(masTechnology);
		
		Client client = new Client();
		client.setAuditFlag("C");
		client.setCreatedBy(0);
		client.setCreatedTimeStamp(Calendar.getInstance().getTime());
		client.setName("test client");
		clientRepository.create(client);
		
		careerCase = new CareerCase();
		careerCase.setCareerCaseStatus(masCareerCaseStatus);
		careerCase.setMasCoreSkill(masCoreSkill);
		careerCase.setMasDivision(masDivision);
		careerCase.setMasJobLevel(masJobLevel);
		careerCase.setMasTechnology(masTechnology);
		careerCase.setClient(client);
		careerCase.setDateRequest(Calendar.getInstance().getTime());
		careerCase.setCode("TEST0001");
		careerCase.setAuditFlag("C");
		careerCase.setCreatedBy(0);
		careerCase.setCreatedTimeStamp(Calendar.getInstance().getTime());
				
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testLoadSessionFactoryShouldPass() throws Exception {
		assertNotNull(sessionFactory);
	}
	
	@Test
	public void testLoadCareerCaseRepositoryShouldPass() throws Exception {
		assertNotNull(careerCaseRepository);
	}
	
	@Test
	public void testCreateWithCareerCaseStatusRepositoryShouldPass() throws Exception {
		
		careerCaseRepository.create(careerCase);
		Integer insertedId = careerCase.getId();
		
		CareerCase result = careerCaseRepository.find(insertedId);
		
		assertThat(result.getCode(), is("TEST0001"));
		
		System.out.println(result.getMasDivision().getCode());
		
	}
	
	@Test
	public void testFindByIdWithCareerCaseRepositoryShouldPass() throws Exception {
		
		careerCase.setCode("TESTCODE");
		careerCaseRepository.create(careerCase);
		Integer insertedId = careerCase.getId();
		
		CareerCase result = careerCaseRepository.find(insertedId);
		
		assertThat(result.getCode(), is("TESTCODE"));
		
	}
	
	@Test
	public void testFindAllWithCareerCaseRepositoryShouldPass() throws Exception {
		
		List<CareerCase> careerCases = careerCaseRepository.findAll();
		
		careerCaseRepository.create(careerCase);
		
		List<CareerCase> result = careerCaseRepository.findAll();
		
		assertThat(result.size(), is(careerCases.size() + 1));
		
	}
	
	@Test
	public void testUpdateWithCareerCaseRepositoryShouldPass() throws Exception {
		
		careerCaseRepository.create(careerCase);
		Integer insertedId = careerCase.getId();
		
		CareerCase update = careerCaseRepository.find(insertedId);
		update.setCode("TEST0002");
		careerCaseRepository.update(update);
		
		CareerCase result = careerCaseRepository.find(update.getId());
		
		assertThat(result.getCode(), is("TEST0002"));
		
	}
	
	@Test
	public void testDeleteWithCareerCaseRepositoryShouldPass() throws Exception {
		
		careerCaseRepository.create(careerCase);
		Integer insertedId = careerCase.getId();
		
		CareerCase delete = careerCaseRepository.find(insertedId);
		careerCaseRepository.delete(delete);
		
		CareerCase result = careerCaseRepository.find(delete.getId());
		
		assertNull(result);
		
	}
	
	@Test
	public void testDeleteByIdWithCareerCaseRepositoryShouldPass() throws Exception {
		
		careerCaseRepository.create(careerCase);
		Integer insertedId = careerCase.getId();
		
		CareerCase delete = careerCaseRepository.find(insertedId);
		careerCaseRepository.deleteById(delete.getId());
		
		CareerCase result = careerCaseRepository.find(delete.getId());
		
		assertNull(result);
		
	}
	
}
