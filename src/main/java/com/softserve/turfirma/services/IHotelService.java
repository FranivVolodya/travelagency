package com.softserve.turfirma.services;

import java.util.List;

import com.softserve.turfirma.domain.Hotel;

/**
 * Interface DAOService for table Hotels.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */
public interface IHotelService {
	public void addHotel(Hotel hotel);
	public void updateHotel(Hotel hotel);
	public Hotel findHotelById(int hotelId);
	public List getAllHotels();
	public void deleteHotels(int id);
}
