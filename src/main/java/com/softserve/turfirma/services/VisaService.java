package com.softserve.turfirma.services;

import java.util.List;

import com.softserve.turfirma.dao.factory.DaoFactory;
import com.softserve.turfirma.domain.*;

/**
* Class create DAOService for table Visas.
* @author Volodya Franiv, Oksana Mykhalets
* @version 1.0 
* @since 19.05.2015
*/
public class VisaService {
	
	/** 
	 *  Add new visa to table.
	 *  @param visa Input object of visa
	 */ 
	public void addVisa(Visa visa) {
		DaoFactory.getInstance().getVisaDao().addElement(visa);
	}

	/** 
	 *  Update information about visa in table.
	 *  @param visa Input object of visa
	 */ 
	public void updateVisa(Visa visa) {
		DaoFactory.getInstance().getVisaDao().updateElement(visa);
	}
	
	/** 
	 *  Return visa with input Id.
	 *  @param visaId Visa Id
	 *  @return Object visa 
	 */
	public  Visa findVisaById(int visaId) {
		return DaoFactory.getInstance().getVisaDao().findElementById(visaId);
	}
	
	/** 
	 *  Return list of all visas.
	 *  @return List list 
	 */
	public  List<Visa> getAllVisas() {
		return DaoFactory.getInstance().getVisaDao().getAllElements();
	}
	
	/** 
	 *  Delete visa. 
	 *  @param visa Input object of visa
	 */
	public  void deleteVisa(Visa visa) {
		 DaoFactory.getInstance().getVisaDao().deleteElement(visa);
	}
	
	/** 
	 *  Return list of all visas that which were issued during the period.  
	 *  @return List of visas
	 *  @param startDate start date
	 *  @param finishDate finish date
	 */
	public  List<Visa> getAllVisasInPeriod(String startDate, String finishDate) {
		return DaoFactory.getInstance().getVisaDao().getAllVisasInPeriod(startDate, finishDate);
	}
	
}
