package com.m2i.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.dao.IClientDAO;
import com.m2i.entity.client.Client;

@RestController
@RequestMapping(value = "/rest/client", headers = "Accept=application/json")
@CrossOrigin(origins="*")
public class ClientRest {
	@Autowired
	private IClientDAO dao;
	
	
	// http://localhost:8080/flight_web/mvc/rest/client
	@RequestMapping(value ="", method = RequestMethod.GET)
	List<Client> getAllClients() {
		return dao.getClients();
	}
	
	
	
}
