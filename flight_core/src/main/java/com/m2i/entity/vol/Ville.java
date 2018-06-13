package com.m2i.entity.vol;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ville {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;
	@Column(length=32)//VARCHAR(32)
	private String nom;
	private Date dateTime;
	
	public Ville() {
		super();
	}

	public Ville( String nom, Date dateTime) {
		super();
		this.nom = nom;
		this.dateTime = dateTime;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Ville [num=" + num + ", nom=" + nom + ", dateTime=" + dateTime + "]";
	}
	
}
