package com.m2i.dao;

import java.util.List;

import com.m2i.entity.client.Client;

public interface IClientDAO {
	public void createClient(Client c);
	public Client readClient(Long id);
	public void updateClient(Client c);
	public void deleteClient(Long id);
	public Client findClientByEmail(String email);
	
	public List<Client> getClients();
}
