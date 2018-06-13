package com.m2i.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
	public List<Client> getClients() {
		return entityManager.createQuery("SELECT c FROM Client c",Client.class)
				.getResultList();
		
	}

	@Override
	public Client findClientByEmail(String email) {		
		try {
			Client clientTrouve = entityManager.createQuery("SELECT c FROM Client c WHERE c.email = :em",Client.class)
					.setParameter("em", email)
					.getSingleResult();
			return clientTrouve;
		} catch (NoResultException e) {
			return null;
		}
	}

}
