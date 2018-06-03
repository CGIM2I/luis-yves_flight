package com.m2i.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.m2i.dao.DAOLocalite;
import com.m2i.dao.IDaoLocalite;
import com.m2i.dao.IDaoVol;
import com.m2i.entity.vol.DateVol;
import com.m2i.entity.vol.Localite;
import com.m2i.entity.vol.Phase;
import com.m2i.entity.vol.Vol;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class TestVol {

	@Autowired
	private IDaoVol daoVol;
	@Autowired
	private IDaoLocalite daoLocalite;
	@Test
	public void testfindAll() {
		List <Vol> vols = daoVol.findAll();
		System.out.println("Test afficher tout les vols");
		for (Vol vol : vols) {
			System.out.println("vols :"+vol.toString());
		}
	}
	@Test
	public void testAjouterVol() {
		Date madate = new Date();
		System.out.println(madate);
		Date date1 = DateVol.dateFromString("2018-01-01");
		Date date2 = DateVol.dateFromString("2018-01-02");
		Localite localiteBerlin = new Localite(null,"Berlin","berlin aeroport");
		Localite localiteHavane = new Localite(null,"Havane","havane aeroport");
		daoLocalite.createLocalite(localiteHavane);
		daoLocalite.createLocalite(localiteBerlin);
		Phase phase1 = new Phase(localiteBerlin,date1);
		Phase phase2 = new Phase(localiteHavane,date2);
		Vol vol = new Vol(null, 45D, phase1, phase2);
		daoVol.createVol(vol);
		System.out.println(vol.toString());
		
	}
	@Test
	public void testEntre() {
		System.out.println("test depart arrivee");
		Localite Singapour = new Localite(null,"Singapour","Singapour aeroport");
		Localite Honkong = new Localite(null,"Honkong","Honkong aeroport");
		daoVol.rechercherVolsEntre(Singapour, Honkong);
		List<Vol> listeVols = daoVol.findAll();
		for (Vol vol : listeVols) {
			System.out.println(vol.toString());
		}
	}
	@Test
	public void rechercherVolParNumero() {
		Vol vol = daoVol.findVol(1L);
		System.out.println(vol);
	}
	@Test 
	public void testVolsDepartArrive() {
		System.out.println("test depart arrivee");
		Date date1 = DateVol.dateFromString("2018-01-01");
		Date date2 = DateVol.dateFromString("2018-01-02");
		Localite Singapour = new Localite(null,"Singapour","Singapour aeroport");
		Localite Honkong = new Localite(null,"Honkong","Honkong aeroport");
		daoLocalite.createLocalite(Singapour);
		daoLocalite.createLocalite(Honkong);
		Phase phase1 = new Phase(Singapour,date1);
		Phase phase2 = new Phase(Honkong,date2);
		Vol vol = new Vol(null, 545D, phase1, phase2);
		daoVol.createVol(vol);
		daoVol.rechercherVolsEntre(Singapour, Honkong);
	}
	
}
