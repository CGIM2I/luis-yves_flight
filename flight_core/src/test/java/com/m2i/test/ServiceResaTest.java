package com.m2i.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.m2i.dao.IClientDAO;
import com.m2i.dao.IReservationDAO;
import com.m2i.entity.Reservation;
import com.m2i.entity.client.Adresse;
import com.m2i.entity.client.Client;
import com.m2i.entity.client.Personne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class ServiceResaTest {
	@Autowired
	private IReservationDAO daoRes;
	@Autowired
	private IClientDAO daoClient;
	@Test
	public void testNouvelleRSA() {
		String nom = "Turcato";
		String prenom = "Martha";
		String mail="martha@gmail.com";
		String tel ="0123456789";
		Adresse adresse = new Adresse("28 rue du moulin", "981247", "Lyon", "France");
		Client client = new Client(nom,prenom,mail,tel, adresse);
		daoClient.createClient(client);
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		
		List <Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes.add(client);
		reservation.setPassagers(listePersonnes);
		daoRes.createResa(reservation);
	}
}
