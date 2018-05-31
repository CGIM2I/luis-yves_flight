package com.m2i.dao;

import java.util.Date;
import java.util.List;

import com.m2i.entity.vol.Localite;

import com.m2i.entity.vol.Vol;

public interface IDaoVol {
	public List<Vol> rechercherVolsAuDepart(Localite villeDepart,Date dateDepart);
	public List<Vol> rechercherVolsEntre(Localite villeDepart,Localite villeArrive);
	public Vol findVol(Long num);//rechercherVolParNum
	public List <Localite> rechercherListeLocalites();
	public void createVol(Vol vol);
	public void updateVol(Vol vol);
	public void deleteVol(Vol vol);
	public List<Vol> findAll();
	
}
