package com.m2i.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.m2i.dao.IClientDAO;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Login;

public class ServiceClient implements IServiceClient {
	@Autowired IClientDAO daoClient;

	@Override
	public Client rechercherClientParId(Long id) {
		return null;
	}

	@Override
	public void enregistrerClient(Client c, Login l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void authentifierClient(String u, String p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierCoorClient(Client c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerInfosClient(Client c) {
		// TODO Auto-generated method stub

	}

}
