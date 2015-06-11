package com.softserve.turfirma.services;

import java.util.List;

import com.softserve.turfirma.dao.factory.DaoFactory;
import com.softserve.turfirma.domain.*;

/**
* Class create DAOService for table Reservations.
* @author Volodya Franiv, Oksana Mykhalets
* @version 1.0 
* @since 19.05.2015
*/
public class ReservationService {
	
	/** 
	 *  Add new reservation to table.
	 *  @param reservation Input object of reservation
	 */ 
	public void addReservation(Reservation reservation) {
		DaoFactory.getInstance().getReservationDao().addElement(reservation);
	}
	
	/** 
	 *  Update information about reservation in table.
	 *  @param reservation Input object of reservation
	 */ 
	public void updateReservation(Reservation reservation) {
		DaoFactory.getInstance().getReservationDao().updateElement(reservation);
	}
	
	/** 
	 *  Return reservation with input Id.
	 *  @param reservationId Reservation Id
	 *  @return Object reservation 
	 */
	public  Reservation findReservationById(int reservationId) {
		return DaoFactory.getInstance().getReservationDao().findElementById(reservationId);
	}
	
	/** 
	 *  Return list of all reservations.
	 *  @return List of reservations 
	 */
	public  List<Reservation> getAllReservations() {
		return DaoFactory.getInstance().getReservationDao().getAllElements();
	}
	
	/** 
	 *  Delete reservation. 
	 *  @param reservation Input object of reservation
	 */
	public  void deleteReservation(Reservation reservation) {
		 DaoFactory.getInstance().getReservationDao().deleteElement(reservation);
	}
}
