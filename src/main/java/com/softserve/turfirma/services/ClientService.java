package com.softserve.turfirma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.turfirma.dao.IEntityDaoClient;
import com.softserve.turfirma.domain.*;

/**
 * Class create DAOService for table Hotels.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */
@Service
public class ClientService implements IClientService{
	
	@Autowired
	private IEntityDaoClient dao;	

	/**
	 * Add client to table.
	 * 
	 * @param client
	 *            Input object of client
	 */
	@Transactional 
	public void addClient(Client client) {
		dao.addElemrnt(client);
	}

	/**
	 * Update information about client in table.
	 * 
	 * @param client
	 *            Input object of client
	 */
	@Transactional
	public void updateClient(Client client, int id) {
		dao.updateElement(client, id);
	}

	/**
	 * Return client with input Id.
	 * 
	 * @param clientId
	 *            Client Id
	 * @return Object client
	 */
	@Transactional
	public Client findClientById(int clientId) {
		return dao.findElementById(clientId);
	}

	/**
	 * Return list of all clients.
	 * 
	 * @return List of clients
	 */
	@Transactional
	public List<Client> getAllClients() {
		return dao.getAllElements();
	}

	/**
	 * Delete client.
	 * 
	 * @param client
	 *            Input object of client
	 */
	@Transactional
	public void deleteClient(int id) {
		dao.deleteElement(id);
	}
}
