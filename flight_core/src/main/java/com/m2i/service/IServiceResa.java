package com.m2i.service;

import java.util.List;

import com.m2i.entity.Reservation;
import com.m2i.entity.client.Client;

public interface IServiceResa {
	public void nouvelleResa(Long numClient, Long numVol, List<Client> listePassagers);
	public Reservation rechercheResa(Long numResa);
	public Reservation rechercherResaSelonClient(Long numClient);
	public void modifierResa(Reservation resa);
	public void annulerResa(Reservation resa);
}
