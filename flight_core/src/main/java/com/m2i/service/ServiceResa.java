package com.m2i.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2i.dao.IClientDAO;
import com.m2i.dao.IDaoVol;
import com.m2i.dao.IPersonneDAO;
import com.m2i.dao.IReservationDAO;
import com.m2i.entity.Reservation;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Personne;
import com.m2i.entity.vol.Vol;

@Component
public class ServiceResa implements IServiceResa {
	@Autowired
	IClientDAO daoClient;
	@Autowired
	IDaoVol daoVol;
	@Autowired
	IPersonneDAO daoPersonne;
	@Autowired
	private IReservationDAO daoRes;
	EntityManager entityManager;
	@Override
	public void nouvelleResa(Long numClient, Long numVol, List<Personne> listePassagers) {

	}

	@Override
	public Reservation rechercheResa(Long numResa) {
		return daoRes.readResa(numResa);
	}

	@Override
	public Reservation rechercherResaSelonClient(Long numClient) {
		String pql ="SELECT reservation FROM Reservation reservation"
				+ " WHERE reservation.client.id="+numClient;
		Reservation reservation = entityManager.createQuery(pql, Reservation.class).getSingleResult();
		return  reservation;
	}

	@Override
	public void modifierResa(Reservation resa) {
		daoRes.updateResa(resa);

	}

	@Override
	public void annulerResa(Reservation resa) {
		daoRes.deleteResa(resa.getNumResa());
	}



}
