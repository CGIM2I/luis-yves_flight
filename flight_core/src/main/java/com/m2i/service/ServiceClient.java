package com.m2i.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2i.dao.IClientDAO;
import com.m2i.dao.ILoginDAO;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Login;

@Component
public class ServiceClient implements IServiceClient {
	@Autowired
	IClientDAO daoClient;
	
	@Autowired
	ILoginDAO daoLogin;

	@Override
	public Client rechercherClientParId(Long id) {
		return daoClient.readClient(id);
	}

	@Override
	public void enregistrerClient(Client c, Login l) {
		daoClient.createClient(c);
		daoLogin.createLogin(l);
	}

	@Override
	public boolean authentifierClient(String username, String password) {
		daoLogin.
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
