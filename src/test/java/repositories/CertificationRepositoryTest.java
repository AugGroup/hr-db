package repositories;

import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.Applicant;
import com.aug.hrdb.entities.Certification;
import com.aug.hrdb.entities.Employee;
import com.aug.hrdb.entities.MasDivision;
import com.aug.hrdb.entities.MasJoblevel;
import com.aug.hrdb.entities.Reward;
import com.aug.hrdb.repositories.ApplicantRepository;
import com.aug.hrdb.repositories.CertificationRepository;
import com.aug.hrdb.repositories.EmployeeRepository;
import com.aug.hrdb.repositories.MasDivisionRepository;
import com.aug.hrdb.repositories.MasJoblevelRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-bean-db-test.xml" })
public class CertificationRepositoryTest {
		
		@Autowired
		private CertificationRepository certificationRepository;
		@Autowired
		private EmployeeRepository employeeRepository;
		@Autowired
		private ApplicantRepository applicantRepository;
		@Autowired
		private MasJoblevelRepository masJoblevelRepository;
		@Autowired
		private MasDivisionRepository masDivisionRepository;
		
		@Before
//		@Rollback(true)
		public void setReward() {
			
	        Applicant applicant = new Applicant();
			applicant.setCreatedBy(1);
			applicant.setCreatedTimeStamp(Calendar.getInstance().getTime());
			applicant.setAuditFlag("C");
			applicant.setCardId("115310905001-9");
			applicant.setAuditFlag("1");
			applicantRepository.create(applicant);
			
	        Applicant applicant1 = applicantRepository.find(1);
	        Hibernate.initialize(applicant1);
	        
	        
//	        employee.setApplicant(applicant1);
	         
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
//			
//			employee.setMasJoblevel(masJoblevel);
//			
//			
//			employeeRepository.create(employee);
//			
//			
//		    employee1 =  employeeRepository.find(1);
			Certification certification = new Certification();
			certification.setApplicant(applicant1);     	
			certification.setName("Java");
			certification.setAuditFlag("C");
			certification.setCreatedBy(1);
			certification.setCreatedTimeStamp(Calendar.getInstance().getTime());
			certificationRepository.create(certification);
			
		}
		@Test
		@Transactional
		@Rollback(value = true)
		public void testInsertCertificationRepository() throws Exception {
			Certification certification = new Certification();
			certification.setName("Java");
			certification.setAuditFlag("C");
			certification.setCreatedBy(1);
			certification.setCreatedTimeStamp(Calendar.getInstance().getTime());
			certificationRepository.create(certification);
		}
		
		@Test
		@Transactional
		@Rollback(value = true)
		public void testUpdateCertificationRepository() throws Exception {
			Certification certification = certificationRepository.find(5);
			certification.setName(".Net");
			certification.setAuditFlag("U");
			certification.setCreatedBy(2);
			certification.setCreatedTimeStamp(Calendar.getInstance().getTime());
			certificationRepository.update(certification);
		}
		
		@Test
		@Transactional
		@Rollback(value = true)
		public void testDeleteByIdCertificationRepository() throws Exception {
			certificationRepository.deleteById(4);
		}

		@Test
		@Transactional
		public void testFindByIdCertificateRepository() throws Exception {
			Certification certification = certificationRepository.find(3);
			assertNotNull(certification.getName());
			
		}

		@Test
		@Transactional
		public void testFindAllCertificateRepository() throws Exception {
			List<Certification> certifications = certificationRepository.findAll();
			for (Certification certification : certifications)
				System.out.println("certification : "
						+ certification.getName());
		}
}
