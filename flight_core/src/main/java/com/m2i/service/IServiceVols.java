package com.m2i.service;

import java.util.Date;
import java.util.List;

import com.m2i.entity.vol.Localite;
import com.m2i.entity.vol.Ville;
import com.m2i.entity.vol.Vol;

public interface IServiceVols {
	public List<Vol> rechercherVolsAuDepart(Localite villeDepart, Date dateDepart);
	public List<Vol> rechercherVolsEntre(Localite villeDepart,Localite villeArrive);
	public Vol rechercherVolParNumero(Long numero);
	public List<Localite> rechercherListeLocalites();
	public void ajouterVol(Vol vol);
	public void modifierVol(Vol vol);
	public void supprimerVol(Vol vol);
	
}
