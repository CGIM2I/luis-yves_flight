package com.m2i.dao;

import com.m2i.entity.client.Login;

public interface ILoginDAO {
	public void createLogin(Login l);
	public Login readFromClientId(Long id);
	public Login readLogin(String username);
	public void updateLogin(Long id);
	public void delete(Long id);
	
}
