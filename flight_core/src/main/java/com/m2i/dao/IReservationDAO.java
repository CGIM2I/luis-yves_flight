package com.m2i.dao;


import com.m2i.entity.Reservation;

public interface IReservationDAO {

	public void createResa(Reservation r);
	public Reservation readResa(Long numResa);
	public void updateResa(Reservation r);
	public void deleteResa(Long num);
}
