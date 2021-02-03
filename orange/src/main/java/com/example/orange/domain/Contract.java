package com.example.orange.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "contracts")

public class Contract {
	
	private long id;
	private String status;
	private String creation_date;
	private String num_seq;
	private String coCode;
	private String customerID;
	private String offerID;
	private String simID;
	private String marketID;
	
	public Contract() {
		super();
	}

	public Contract(long id, String status, String creation_date, String num_seq, String coCode, String customerID,
			String offerID, String simID, String marketID) {
		super();
		this.id = id;
		this.status = status;
		this.creation_date = creation_date;
		this.num_seq = num_seq;
		this.coCode = coCode;
		this.customerID = customerID;
		this.offerID = offerID;
		this.simID = simID;
		this.marketID = marketID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "status", nullable = false)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	@Column(name = "creation_date", nullable = false)
	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@Column(name = "num_seq", nullable = false)
	public String getNum_seq() {
		return num_seq;
	}

	public void setNum_seq(String num_seq) {
		this.num_seq = num_seq;
	}

	@Column(name = "co_code", nullable = false)
	public String getCoCode() {
		return coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	@Column(name = "customerID", nullable = false)
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	@Column(name = "offerID", nullable = false)
	public String getOfferID() {
		return offerID;
	}

	public void setOfferID(String offerID) {
		this.offerID = offerID;
	}

	@Column(name = "simID", nullable = false)
	public String getSimID() {
		return simID;
	}

	public void setSimID(String simID) {
		this.simID = simID;
	}

	@Column(name = "marketID", nullable = false)
	public String getMarketID() {
		return marketID;
	}

	public void setMarketID(String marketID) {
		this.marketID = marketID;
	}
	

}
