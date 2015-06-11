package com.softserve.turfirma.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToOne;

/**
 * Class create entity for table Visas.
 * 
 * @author Volodya Franiv, Oksana Mykhalets
 * @version 1.0
 * @since 19.05.2015
 */

@Entity
@Table(name = "Visas")
public class Visa {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DateOpen")
	private Date dateOpen;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DateClose")
	private Date dateClose;
	
	@ManyToOne
	@JoinColumn(name = "ClientId")
	private Client client;

	public Visa() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOpen() {
		return dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	public Date getDateClose() {
		return dateClose;
	}

	public void setDateClose(Date dateClose) {
		this.dateClose = dateClose;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
