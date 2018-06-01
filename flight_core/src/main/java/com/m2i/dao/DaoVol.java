package com.m2i.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.vol.Localite;

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
		return entityManager.createQuery("SELECT v FROM Vol v",Vol.class).getResultList();
	}

	@Override
	public List<Vol> rechercherVolsAuDepart(Localite villeDepart, Date dateDepart) {
		//SELECT * from vol inner join localite on localite.id =vol.refLocDepart WHERE localite.ville="Paris" AND DATE_FORMAT(vol.dateTimeDepart,"%Y/%M")=2017/01
		return entityManager.createQuery("SELECT vol FROM Vol vol INNER JOIN "
				+ "Localite localite ON vol.refLocDepart = localite.id "
				+ "WHERE STR_TO_DATE(dateDepart,%Y-%m-%d)=:dateTimeDepart"//FUNCTION("date_format", o.effectiveStartDate, "the_date_format")
				+ "AND localite.ville=:villeDepart", 
				Vol.class).setParameter("dateDepart", dateDepart).setParameter("villeDepart", villeDepart).
				getResultList();
	}


	@Override
	public List<Vol> rechercherVolsEntre(Localite villeDepart, Localite villeArrive) {
		return entityManager.createQuery("SELECT vol FROM Vol vol "
				+ "WHERE vol.depart.localite.ville=:villeDepart AND vol.arrivee.localite.ville=:villeArrive",Vol.class)
				.setParameter("villeDepart", villeDepart.getVille())
				.setParameter("villeArrive",villeArrive.getVille())
				.getResultList();
	}
	public void name() {
		
	}

	
}
