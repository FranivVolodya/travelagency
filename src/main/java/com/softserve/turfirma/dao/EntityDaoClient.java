package com.softserve.turfirma.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softserve.turfirma.domain.Client;


/**
 * Class produce main CRUD operations for entity Client.
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0 
 * @since 19.05.2015
 */
@Repository
public class EntityDaoClient implements IEntityDaoClient {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addElemrnt(Client client) {
		sessionFactory.getCurrentSession().save(client);
	}

	public void updateElement(Client client, int id) {
		Client clientTm = (Client) sessionFactory.getCurrentSession().load(Client.class, id);
		if (null != clientTm) {
		clientTm.setApartment(client.getApartment());
		clientTm.setCity(client.getApartment());
		clientTm.setHouse(client.getHouse());
		clientTm.setName(client.getName());
		clientTm.setPassportNumber(client.getPassportNumber());
		clientTm.setPhoneNumber(client.getPhoneNumber());
		clientTm.setStreet(client.getStreet());
		clientTm.setStreet(client.getStreet());
		}	
		sessionFactory.getCurrentSession().update(clientTm);
		
	}

	public Client findElementById(int clientId) {
		return null;
	}

	public List getAllElements() {
		return sessionFactory.getCurrentSession().createQuery("from Client").list();
	}

	public void deleteElement(int id) {
		
		Client client = (Client) sessionFactory.getCurrentSession().load(Client.class, id);
				if (null != client) {
				sessionFactory.getCurrentSession().delete(client);
				}	
	}

}
