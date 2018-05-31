package com.m2i.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.m2i.dao.ClientDAO;
import com.m2i.dao.IClientDAO;
import com.m2i.dao.ILoginDAO;
import com.m2i.entity.client.Adresse;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Login;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class TestClientDAO {
	@Autowired
	private IClientDAO daoClient;
//	@Autowired
//	private ILoginDAO daoLogin;
	
	@Test
	public void test1() {
		Adresse a = new Adresse("11 rue François Millet", "75016", "Paris", "France");
		Login l = new Login();
		l.setUsername("yves");
		l.setPassword("1234");
		Client c = new Client("Savang", "Yves", "yvessav@free.fr", "010000000", a);
		
		daoClient.createClient(c);
		
		daoClient.deleteClient(1L);
		
	}
	
	@Test
	public void test2() {
		
	}
}
