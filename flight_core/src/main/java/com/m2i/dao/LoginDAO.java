package com.m2i.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.m2i.entity.client.Login;

@Component
@Transactional
public class LoginDAO implements ILoginDAO {
	
	
	@PersistenceContext(unitName = "myPersistenceUnitName")
	private EntityManager entityManager;


	@Override
	public void createLogin(Login l) {
		entityManager.persist(l);
	}

	@Override
	public Login readFromClientId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Login readLogin(String username) {
		return entityManager.createNamedQuery(
				"Login.findLoginWithUsername" , Login.class)
								.setParameter("un", username)
					            .getSingleResult();
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
