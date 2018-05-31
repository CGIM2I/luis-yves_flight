package com.m2i.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import com.m2i.dao.IDaoVol;
import com.m2i.entity.vol.Vol;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/beans.xml")
public class TestVol {
	private static final String List = null;
	@Autowired
	private IDaoVol daoVol;
	
	@Test
	public void testVolsDepartArrive() {
		List <Vol> vols = daoVol.findAll();
		for (Vol vol : vols) {
			System.out.println(vol.toString());
		}
	}

}
