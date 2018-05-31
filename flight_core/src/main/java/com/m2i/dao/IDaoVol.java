package com.m2i.dao;

import java.util.List;

import com.m2i.entity.Vol;

public interface IDaoVol {
	public Vol findVol(Long num);
	public void createVol(Vol vol);
	public void updateVol(Vol vol);
	public void deleteVol(Vol vol);
	public List<Vol> findAll();
}
