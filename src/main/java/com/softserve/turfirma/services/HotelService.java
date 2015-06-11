package com.softserve.turfirma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;






import com.softserve.turfirma.dao.IEntityDaoClient;
import com.softserve.turfirma.dao.IEntityDaoHotel;
import com.softserve.turfirma.domain.*;

/**
 * Class create DAOService for table Hotels.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */
@Service
public class HotelService implements IHotelService{
	
	@Autowired
	private IEntityDaoHotel dao;
	
	/**
	 * Add new hotel to table.
	 * 
	 * @param hotel
	 *            Input object of hotel
	 */
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void addHotel(Hotel hotel) {
		dao.addElemrnt(hotel);
	}

	/**
	 * Update information about hotel in table.
	 * 
	 * @param hotel
	 *            Input object of hotel
	 */
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public void updateHotel(Hotel hotel) {
		dao.updateElement(hotel);
	}

	/**
	 * Return hotel with input Id.
	 * 
	 * @param hotelId
	 *            Hotel Id
	 * @return Object hotel
	 */
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public Hotel findHotelById(int hotelId) {
		return dao.findElementById(hotelId);
	}

	/**
	 * Return list of all hotels.
	 * 
	 * @return List list
	 */
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public List<Hotel> getAllHotels() {
		return dao.getAllElements();
	}

	/**
	 * Delete hotel.
	 * 
	 * @param hotel
	 *            Input object of hotel
	 */
	public void deleteHotels(int id) {
		dao.deleteElement(id);
	}

//	/**
//	 * Return list of client that was and will be living in hotel.
//	 * 
//	 * @return List of client
//	 * @param hotelName
//	 *            Hotel name
//	 */
//	public List<Client> getAllClientsFromHotel(String hotelName) {
//		return DaoFactory.getInstance().getHotelDao()
//				.getAllClientsFromHotel(hotelName);
//	}
//
}
