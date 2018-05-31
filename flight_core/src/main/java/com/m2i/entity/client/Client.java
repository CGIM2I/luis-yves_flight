package com.m2i.entity.client;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("CLI")
public class Client extends Personne {
	@Embedded
	private Adresse adresse;
	@OneToOne(mappedBy="client")
	private Login login;

	public Client() {

	}
	
	

	public Client(String nom, String prenom, String email, String telephone, Adresse adresse, Login login) {
		super(nom, prenom, email, telephone);
		this.adresse = adresse;
		
		
	}



	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
