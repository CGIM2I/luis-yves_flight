package com.m2i.entity.client;

import java.util.List;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.m2i.entity.Reservation;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("CLI")
public class Client extends Personne {
	@OneToMany(mappedBy="client") //Lazy par defaut
	private List<Reservation> listeResa;
	public Client() {
		super();
	}

	public Client(String nom, String prenom, String email, String telephone, Adresse adresse) {
		super(nom, prenom, email, telephone, adresse);
	}

	@Override
	public String toString() {
		return "Client [" + "id=" + getId() + ", nom=" + getNom() + ", prenom="
				+ getPrenom() + ", email=" + getEmail() + ", Telephone=" + getTelephone() + ", adresse=" + getAdresse();
	}
	
	
	
	
}
