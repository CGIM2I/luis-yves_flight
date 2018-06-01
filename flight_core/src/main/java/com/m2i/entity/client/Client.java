package com.m2i.entity.client;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("CLI")
public class Client extends Personne {
	public Client() {

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
