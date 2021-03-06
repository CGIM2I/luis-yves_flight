package com.m2i.test;

import java.util.List;

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
public class ClientDAOTest {
	@Autowired
	private IClientDAO daoClient;
	@Autowired
	private ILoginDAO daoLogin;
	
	
	public void deleteTest() {
		daoClient.deleteClient(2L);
	}
	
	@Test
	public void getAllTest() {
		List<Client> list = daoClient.getClients();
		System.out.println("Liste des clients :");
		for (Client client : list) {
			System.out.println("\t" + client);
		}
	}
	
	@Test
	public void getClientTest() {
		Client c = daoClient.readClient(3L);
		System.out.println(c);
	}
	
	@Test
	public void getClientByEmail() {
		Client c = daoClient.findClientByEmail("ncockton6@economist.com");
		System.out.println(c);
	}
}
