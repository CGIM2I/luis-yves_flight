package com.m2i.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.dao.IClientDAO;
import com.m2i.entity.client.Client;

@RestController
@RequestMapping(value = "/rest/client", headers = "Accept=application/json")
@CrossOrigin(origins = "*")
public class ClientRest {
	@Autowired
	private IClientDAO dao;

	// http://localhost:8080/flight_web/mvc/rest/client
	@RequestMapping(value = "", method = RequestMethod.GET)
	List<Client> getAllClients() {
		return dao.getClients();
	}

	// http://localhost:8080/flight_web/mvc/rest/client/{code}
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	ResponseEntity<Client> getClientById(@PathVariable(name = "code") Long code) {
		try {
			Client c = dao.readClient(code);
			if (c == null)
				return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<Client>(c, HttpStatus.OK);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());// ou logger....
			return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// http://localhost:8080/flight_web/mvc/rest/client/
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<Client> postClient(@RequestBody Client c) {
		System.out.println(c);
		try {
			Client clientExistant = dao.findClientByEmail(c.getEmail());
			// System.out.println("ça s'est bien passé");
			if (clientExistant == null) {
				System.out.println("création d'un client");
				dao.createClient(c);
			} else
				dao.updateClient(c);
			return new ResponseEntity<Client>(c, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());// ou logger....
			return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
