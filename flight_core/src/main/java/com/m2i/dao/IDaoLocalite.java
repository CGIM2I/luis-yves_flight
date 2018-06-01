package com.m2i.dao;

import java.util.List;

import com.m2i.entity.vol.Localite;

public interface IDaoLocalite {
	//CRUD pour Localite
	public Localite findLocalite(Localite localite);
	public void createLocalite(Localite localite);
	public void updateLocalite(Localite Localite);
	public void deleteVol(Localite localite);
	public List <Localite> rechercherListeLocalites();
}
