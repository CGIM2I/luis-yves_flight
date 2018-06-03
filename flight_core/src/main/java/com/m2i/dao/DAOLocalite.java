package com.m2i.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.vol.Localite;
import com.m2i.entity.vol.Vol;
@Component
@Transactional
public class DaoLocalite implements IDaoLocalite {
	@PersistenceContext(unitName="myPersistenceUnitName")
	private EntityManager entityManager;
	@Override
	public Localite findLocalite(Localite localite) {
		return entityManager.find(Localite.class, localite);
	}

	@Override
	public void createLocalite(Localite localite) {
		entityManager.persist(localite);
	}

	@Override
	public void updateLocalite(Localite localite) {
		entityManager.merge(localite);
	}

	@Override
	public void deleteVol(Localite localite) {
		entityManager.remove(localite);
	}

	@Override
	public List<Localite> rechercherListeLocalites() {
		return entityManager.createQuery("SELECT localites FROM Localite as localites",Localite.class)
				.getResultList();
	}



}
