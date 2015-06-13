package com.softserve.turfirma.dao;

import java.util.List;

import com.softserve.turfirma.domain.*;

/**
* DAOInterface for clients.
* @author Volodya Franiv, Oksana Mykhalets
* @version 1.0 
* @since 19.05.2015
*/
public interface IEntityDaoClient {
	public void addElemrnt(Client client);
	public void updateElement(Client client, int id);
	public Client findElementById(int clientId);
	public List getAllElements();
	public void deleteElement(int id);

}
