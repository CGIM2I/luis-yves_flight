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
		String nom = "Dupont";
		String prenom = "Dimitri";
		String mail="dimitri@gmail.com";
		String tel ="0123456789";
		Adresse adresse = new Adresse("45 rue du Maine", "981247", "Lyon", "France");
		Client client = new Client(nom,prenom,mail,tel, adresse);
		daoClient.createClient(client);
		Reservation reservation = new Reservation();
		reservation.setClient(client);
		Personne personne = new Personne();
		personne.setId(null);
		personne.setNom(nom);
		personne.setPrenom(prenom);
		personne.setEmail(mail);
		personne.setTelephone(tel);
		personne.setAdresse(adresse);
		List <Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes.add(personne);
		reservation.setPassagers(listePersonnes);
		System.out.println(reservation.toString());
		daoRes.createResa(reservation);
	}
}
