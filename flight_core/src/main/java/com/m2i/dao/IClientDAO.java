package com.m2i.dao;

import com.m2i.entity.client.Client;

public interface IClientDAO {
	public void createClient(Client c);
	public Client readClient(Long id);
	public void updateClient(Client c);
	public void deleteClient(Client c);
}
