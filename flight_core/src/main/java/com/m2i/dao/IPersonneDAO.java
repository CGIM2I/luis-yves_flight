package com.m2i.dao;

import com.m2i.entity.client.Personne;

public interface IPersonneDAO {
	public void createPersonne(Personne p);
	public Personne readPersonne(Long id);
	public void updatePersonne(Personne p);
	public void deletePersonne(Long id);
}
