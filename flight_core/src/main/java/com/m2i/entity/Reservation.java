package com.m2i.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.m2i.entity.client.Client;
import com.m2i.entity.client.Personne;
import com.m2i.entity.vol.Vol;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numResa")
	private Long numResa;
	
	@Column(name="comment")
	private String comment;
	
	@Temporal(TemporalType.DATE)
	private Date dateResa;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade= {
			CascadeType.REFRESH,
			CascadeType.DETACH,
			CascadeType.MERGE
			})
//	@JoinColumn(name="id")
	private Client client;
	
	@ManyToMany(cascade= {
			CascadeType.REFRESH,
			CascadeType.DETACH,
			CascadeType.MERGE
			})
	private List<Personne> passagers;
	
	@OneToMany(cascade= {
			CascadeType.REFRESH,
			CascadeType.DETACH,
			CascadeType.MERGE
			})
	@JoinColumn(name="num")
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
