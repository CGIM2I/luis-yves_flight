package com.m2i.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.m2i.dao.IDaoLocalite;
import com.m2i.dao.IDaoVol;

import com.m2i.entity.vol.Localite;
import com.m2i.entity.vol.Ville;
import com.m2i.entity.vol.Vol;

public class ServiceVols implements IServiceVols {
	@Autowired
	private IDaoVol daoVol;
	@Autowired
	private IDaoLocalite daoLocalite;
	@Override
	public List<Vol> rechercherVolsAuDepart(Localite villeDepart, Date dateDepart) {
		daoVol.rechercherVolsAuDepart(villeDepart, dateDepart);
		List<Vol> listeVols = daoVol.findAll();
		return listeVols;
	}

	@Override
	public List<Vol> rechercherVolsEntre(Localite villeDepart, Localite villeArrive) {
		return daoVol.rechercherVolsEntre(villeDepart, villeArrive);
	}

	@Override
	public Vol rechercherVolParNumero(Long numero) {
		return daoVol.findVol(numero);
	}

	@Override
	public List<Localite> rechercherListeLocalites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterVol(Vol vol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierVol(Vol vol) {
		// TODO Auto-generated method stub
		
	}
	
}
