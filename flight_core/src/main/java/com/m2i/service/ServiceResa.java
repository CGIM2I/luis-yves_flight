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
		Client client;
		Vol vol;
		List<Vol> listevols = new ArrayList<Vol>();
		client = daoClient.readClient(numClient);
		vol = daoVol.findVol(numVol);
		listevols.add(vol);
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		reservation.setPassagers(listePassagers);
		reservation.setVols(listevols);
		daoRes.createResa(reservation);
	}

	@Override
	public Reservation rechercheResa(Long numResa) {
		return daoRes.readResa(numResa);
	}

	@Override
	public Reservation rechercherResaSelonClient(Long numClient) {
		String qlString ="SELECT client FROM Client client INNER JOIN"
				+ "Reservation reservation ON reservation.numResa";
		return  null;
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
