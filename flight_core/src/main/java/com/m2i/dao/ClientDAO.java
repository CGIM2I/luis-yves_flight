package com.m2i.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.client.Client;

@Component
@Transactional
public class ClientDAO implements IClientDAO {

	@PersistenceContext(unitName = "myPersistenceUnitName")
	private EntityManager entityManager;

	@Override
	public void createClient(Client c) {
		System.out.println("Méthode : createClient");
		entityManager.persist(c);
	}

	@Override
	public Client readClient(Long id) {
		return entityManager.find(Client.class, id /* id/pk */);
	}

	@Override
	public void updateClient(Client c) {
		entityManager.merge(c);

	}

	@Override
	public void deleteClient(Long id) {
		System.out.println("Méthode : deleteClient");
		Client c = entityManager.find(Client.class, id);
		entityManager.remove(c);
	}

	@Override
	public void getClients() {
		// TODO Auto-generated method stub
		
	}

}
