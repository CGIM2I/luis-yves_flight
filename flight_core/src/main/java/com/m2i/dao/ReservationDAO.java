package com.m2i.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.Reservation;

@Component
@Transactional
public class ReservationDAO implements IReservationDAO {

	@PersistenceContext(unitName = "myPersistenceUnitName")
	private EntityManager entityManager;
	
	@Override
	public void createResa(Reservation r) {
		entityManager.persist(r);		
	}

	@Override
	public Reservation readResa(Long numResa) {
		return entityManager.find(Reservation.class, numResa /* id/pk */);
	}

	@Override
	public void updateResa(Reservation r) {
		entityManager.merge(r);		
	}

	@Override
	public void deleteResa(Long num) {
		Reservation r = entityManager.find(Reservation.class, num);
		entityManager.remove(r);		
	}

}
