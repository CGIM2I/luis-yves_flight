package com.m2i.service;

import com.m2i.entity.client.Client;
import com.m2i.entity.client.Login;

public interface IServiceClient {
	public Client rechercherClientParId(Long id);
	public void enregistrerClient(Client c, Login l);
	public boolean authentifierClient(String u, String p);
	public void modifierCoorClient(Client c);
	public void supprimerInfosClient(Client c);
}
