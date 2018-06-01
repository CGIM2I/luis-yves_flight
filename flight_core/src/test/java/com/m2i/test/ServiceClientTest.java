package com.m2i.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.m2i.entity.client.Adresse;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Login;
import com.m2i.service.IServiceClient;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class ServiceClientTest {
	@Autowired
	private IServiceClient sc;
	
	@Test
	public void rechercherClientParIdTest() {
		Client c = sc.rechercherClientParId(27L);
		System.out.println(c);
		c = sc.rechercherClientParId(38L);
		System.out.println(c);
		c = sc.rechercherClientParId(69L);
		System.out.println(c);
	}
	
	@Test
	public void enregistrerClientTest() {
		Adresse a = new Adresse("11 rue François Millet", "75016", "Paris", "France");
		Login l = new Login();
		l.setUsername("yves");
		l.setPassword("1234");
		
		Client c = new Client("Savang", "Yves", "yvessav@free.fr", "010000000", a);
		l.setClient(c);
		
		sc.enregistrerClient(c, l);
	}
	
	@Test
	public void authentifierClientTest() {
		String username = "bmccaighey2k";
		String password = "VA0o0eQM";
		
	}
	
	
}
