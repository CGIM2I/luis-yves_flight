package com.m2i.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.m2i.dao.ILoginDAO;
import com.m2i.service.IServiceClient;

public class ServiceClientTest {
	@Autowired
	private IServiceClient sc;
	
	@Test
	public void readLoginTest() {
		sc.authentifierClient("", "");
	}
}
