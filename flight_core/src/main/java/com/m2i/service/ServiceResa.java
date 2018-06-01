package com.m2i.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2i.dao.IClientDAO;
import com.m2i.dao.IDaoVol;
import com.m2i.dao.IPersonneDAO;
import com.m2i.entity.Reservation;
import com.m2i.entity.client.Client;

@Component
public class ServiceResa implements IServiceResa {
	@Autowired
	IClientDAO daoClient;
	@Autowired
	IDaoVol daoVol;
	@Autowired
	IPersonneDAO daoPersonne;

	@Override
	public void nouvelleResa(Long numClient, Long numVol, List<Client> listePassagers) {
		
	}

	@Override
	public Reservation rechercheResa(Long numResa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation rechercherResaSelonClient(Long numClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierResa(Reservation resa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void annulerResa(Reservation resa) {
		// TODO Auto-generated method stub

	}

}
