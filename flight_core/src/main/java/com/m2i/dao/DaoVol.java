package com.m2i.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.vol.Vol;

@Component
@Transactional
public class DaoVol implements IDaoVol{
	@PersistenceContext(unitName="myPersistenceUnitName")
	private EntityManager entityManager;

	@Override
	public Vol findVol(Long num) {
		return entityManager.find(Vol.class, num);
	}

	@Override
	public void createVol(Vol vol) {
		entityManager.persist(vol);
		
	}

	@Override
	public void updateVol(Vol vol) {
		entityManager.merge(vol);
		
	}

	@Override
	public void deleteVol(Vol vol) {
		entityManager.remove(vol);
	}



	@Override
	public List<Vol> findAll() {
		
		return entityManager.createNamedQuery(
				"Vol.findVolByNumVol",Vol.class).
	}
	
}
