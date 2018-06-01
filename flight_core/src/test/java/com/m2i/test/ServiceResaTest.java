package com.m2i.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.m2i.dao.IReservationDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class ServiceResaTest {
	@Autowired
	private IReservationDAO reservation;
	
	@Test
	public void testNouvelleRSA() {
		
	}
}
