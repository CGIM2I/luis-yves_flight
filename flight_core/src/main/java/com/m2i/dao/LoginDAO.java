package com.m2i.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.m2i.entity.client.Login;

@Component
public class LoginDAO implements ILoginDAO {
	
	
	@PersistenceContext(unitName = "myPersistenceUnitName")
	private EntityManager entityManager;


	@Override
	public void createLogin(Login l) {
		// TODO Auto-generated method stub
	}

	@Override
	public Login readFromClientId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Login readLogin(String username) {
		return null;
	}

	@Override
	public void updateLogin(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
