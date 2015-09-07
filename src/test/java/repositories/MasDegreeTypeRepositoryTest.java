/**
 *
 * @author Pranrajit
 * @date 4 ก.ย. 2558
 */
package repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.MasDegreetype;
import com.aug.hrdb.repositories.MasDegreetypeRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-bean-db-test.xml" })
@Transactional
public class MasDegreeTypeRepositoryTest {

	@Autowired MasDegreetypeRepository masDegreetypeRepository;
	
	@Test
	@Rollback(false)
	public void createMasDegreeType(){
		MasDegreetype masDegreetype=new MasDegreetype();
		masDegreetype.setName("Master");
		masDegreetype.setCode("DE-01");
		masDegreetype.setIsactive(true);
		masDegreetypeRepository.getCurrentSession().save(masDegreetype);
	}

	/*@Test
	@Rollback(false)
	public void updateMasDegreeType(){
		MasDegreetype masDegreetype=(MasDegreetype)masDegreetypeRepository.getCurrentSession().get(MasDegreetype.class,2);
		masDegreetype.setName("DR");
		masDegreetype.setCode("DE-01");
		masDegreetype.setIsactive(true);
		masDegreetypeRepository.getCurrentSession().update(masDegreetype);
	}*/
	
	/*@Test
	@Rollback(false)
	public void deleteMasDegreeType(){
		MasDegreetype masDegreetype=(MasDegreetype)masDegreetypeRepository.getCurrentSession().get(MasDegreetype.class,3);
		masDegreetypeRepository.getCurrentSession().delete(masDegreetype);
		
	}
	*/
}