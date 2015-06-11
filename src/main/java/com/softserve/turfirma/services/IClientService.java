package com.softserve.turfirma.services;

import java.util.List;

import com.softserve.turfirma.domain.Client;

/**
 * Interface DAOService for table Clients.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */
public interface IClientService {
	public void addClient(Client client);
	public void updateClient(Client client);
	public Client findClientById(int clientId);
	public List getAllClients();
	public void deleteClient(int id);
	}
