package com.m2i.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	
	@Test
	public void testfindAll() {
		List <Vol> vols = daoVol.findAll();
		System.out.println("Test afficher tout les vols");
		for (Vol vol : vols) {
			System.out.println("vols :"+vol.toString());
		}
	}
	@Test
	public void testCreateVol() {
		Date date1 = DateVol.dateFromString("2018-01-01");
		Date date2 = DateVol.dateFromString("2018-01-02");
		Localite localiteBerlin = new Localite(28L,"Berlin","berlin aeroport");
		Localite localiteHavane = new Localite(28L,"Havane","havane aeroport");
		Phase phase1 = new Phase(localiteBerlin,date1);
		Phase phase2 = new Phase(localiteHavane,date2);
		Vol vol = new Vol(58L, 45D, phase1, phase2);
		System.out.println(vol.toString());
		
	}

}
