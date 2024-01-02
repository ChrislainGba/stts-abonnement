/**
 * 
 */
package com.xl1.stts.abonnement.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xl1.stts.abonnement.dto.AbonnementDTO;
import com.xl1.stts.abonnement.entity.Abonnement;
import com.xl1.stts.abonnement.entity.AbonnementGSM;
import com.xl1.stts.abonnement.entity.AbonnementInternet;
import com.xl1.stts.abonnement.mapper.AbonnementMapper;

/**
 * 
 */
public class IAbonnementServiceTest {
	
	private IAbonnementService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		service = (IAbonnementService)context.getBean("service");
	}

	@Test
	public void addAbonnementTest() {
		List<AbonnementDTO> abs1 = service.listAbonnements(true);
		service.addAbonnement(AbonnementMapper.toAbonnementDTO(new AbonnementGSM(new Date(), 10, false, 9)));
		service.addAbonnement(AbonnementMapper.toAbonnementDTO(new AbonnementInternet(new Date(), 20, true, 19)));
		List<AbonnementDTO> abs2 = service.listAbonnements(true);
		assertTrue(abs1.size()+1==abs2.size());
	}

}
