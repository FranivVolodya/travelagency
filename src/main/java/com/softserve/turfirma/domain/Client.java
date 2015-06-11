package com.softserve.turfirma.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class create entity for table Clients.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */

@Entity
@Table(name = "Clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Surname")
	private String surname;

	@Column(name = "PhoneNumber")
	private String phoneNumber;
	
	@Column(name = "PassportNumber")
	private String passportNumber;

	@Column(name = "City")
	private String city;

	@Column(name = "Street")
	private String street;

	@Column(name = "House")
	private String house;

	@Column(name = "Apartment")
	private String apartment;

//	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
//	private Set<Reservation> reservations = new HashSet<Reservation>(0);
//
//	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
//	private Set<Visa> visas = new HashSet<Visa>(0);

	public Client() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

//	public Set<Reservation> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(Set<Reservation> reservations) {
//		this.reservations = reservations;
//	}
//
//	public Set<Visa> getVisas() {
//		return visas;
//	}
//
//	public void setVisas(Set<Visa> visas) {
//		this.visas = visas;
//	}

}
