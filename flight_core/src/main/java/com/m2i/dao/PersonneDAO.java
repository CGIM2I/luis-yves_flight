package com.m2i.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.client.Personne;

@Component
@Transactional
public class PersonneDAO implements IPersonneDAO {
	
	@PersistenceContext(unitName = "myPersistenceUnitName")
	private EntityManager entityManager;

	@Override
	public void createPersonne(Personne p) {
		entityManager.persist(p);
	}

	@Override
	public Personne readPersonne(Long id) {
		return entityManager.find(Personne.class, id /* id/pk */);
	}

	@Override
	public void updatePersonne(Personne p) {
		entityManager.merge(p);

	}

	@Override
	public void deletePersonne(Long id) {
		System.out.println("Méthode : deleteClient");
		Personne p = entityManager.find(Personne.class, id);
		entityManager.remove(p);
	}

}
