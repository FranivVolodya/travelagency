package com.softserve.turfirma.dao;

import java.util.List;

import com.softserve.turfirma.domain.*;

public interface IEntityDaoHotel {
	public void addElemrnt(Hotel hotel);
	public void updateElement(Hotel hotel);
	public Hotel findElementById(int hotelId);
	public List getAllElements();
	public void deleteElement(int id);

}
