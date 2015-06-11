package com.softserve.turfirma.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softserve.turfirma.domain.Client;
import com.softserve.turfirma.domain.Hotel;

/**
 * Class produce main CRUD operations for entity Hotel.
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0 
 * @since 19.05.2015
 */

@Repository
public class EntityDaoHotel implements IEntityDaoHotel {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addElemrnt(Hotel hotel) {
		sessionFactory.getCurrentSession().save(hotel);
		
	}

	public void updateElement(Hotel hotel) {
		sessionFactory.getCurrentSession().update(hotel);
		
	}

	public Hotel findElementById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAllElements() {
		return sessionFactory.getCurrentSession().createQuery("from Hotel").list();
	}

	public void deleteElement(int id) {
		Hotel hotel = (Hotel) sessionFactory.getCurrentSession().load(Hotel.class, id);
				if (null != hotel) {
				sessionFactory.getCurrentSession().delete(hotel);
				}	
	}

}
