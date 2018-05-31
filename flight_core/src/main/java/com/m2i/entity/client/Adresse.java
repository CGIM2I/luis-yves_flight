package com.m2i.entity.client;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String numEtRue;
	private String codePostal;
	private String ville;
	private String pays;

	public Adresse() {

	}
	
	

	public Adresse(String numEtRue, String codePostal, String ville, String pays) {
		super();
		this.numEtRue = numEtRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}



	public String getNumEtRue() {
		return numEtRue;
	}

	public void setNumEtRue(String numRue) {
		this.numEtRue = numRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}



	@Override
	public String toString() {
		return "Adresse [numéro et rue=" + numEtRue + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays
				+ "]";
	}
}
