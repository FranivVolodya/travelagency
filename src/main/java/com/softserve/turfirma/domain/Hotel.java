package com.softserve.turfirma.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class create entity for table Hotels.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */

@Entity
@Table(name = "Hotels")
public class Hotel {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Name")
	private String name;

	@Column(name = "City")
	private String city;

	@Column(name = "IsAvaliable")
	private Boolean isAvaliable;

//	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
//	private Set<Reservation> reservations = new HashSet<Reservation>();

	public Hotel() {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getIsAvaliable() {
		return isAvaliable;
	}

	public void setIsAvaliable(Boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

//	public Set<Reservation> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(Set<Reservation> reservations) {
//		this.reservations = reservations;
//	}
	
}
