package com.m2i.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.Vol;

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
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Vol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
