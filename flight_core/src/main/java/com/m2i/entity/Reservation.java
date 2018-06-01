package com.m2i.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.m2i.entity.client.Client;
import com.m2i.entity.client.Personne;
import com.m2i.entity.vol.Vol;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numResa;
	@OneToOne(fetch = FetchType.LAZY)
	private Client client;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Personne> passagers;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Vol> vols;

	public Long getNumResa() {
		return numResa;
	}

	public void setNumResa(Long numResa) {
		this.numResa = numResa;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Personne> getPassagers() {
		return passagers;
	}

	public void setPassagers(List<Personne> passagers) {
		this.passagers = passagers;
	}

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

	@Override
	public String toString() {
		return "Reservation [numResa=" + numResa + "]";
	}

}
