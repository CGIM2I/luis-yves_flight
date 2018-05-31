package com.m2i.service;

import java.util.Date;

import com.m2i.entity.vol.Ville;
import com.m2i.entity.vol.Vol;

public interface IServiceVols {
	public void rechercherVolsAuDepart(Ville villeDepart, Date dateDepart);
	public void rechercherVolsEntre(Ville villeDepart,Ville villeArrive);
	public void rechercherVolParNumero(Long numero);
	public void rechercherListeLocalites();
	public void ajouterVol(Vol vol);
	public void modifierVol(Vol vol);
	
}
