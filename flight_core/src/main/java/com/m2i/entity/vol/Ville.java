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
}
