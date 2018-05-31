package com.m2i.service;

import com.m2i.entity.Client;

public interface IServiceClient {
	public Client rechercherClientParId();
	public void enregistrerClient(String username, String login);
	public void authentifierClient();
	public void modifierCoorClient();
	public void supprimerInfosClient();
}
