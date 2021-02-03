package com.example.orange.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offersG")
public class OfferG {

	public long offerID;
	public String offerName;
	public String offer_desc;
	
	public OfferG(long offerID, String offerName,  String offer_desc) {
		super();
		this.offerID = offerID;
		this.offerName = offerName;

		this.offer_desc = offer_desc;
	}

	public OfferG() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getOfferID() {
		return offerID;
	}

	public void setOfferID(long offerID) {
		this.offerID = offerID;
	}
	@Column(name = "offerName", nullable = false)
	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	@Column(name = "offerDesc", nullable = false)
	public String getOffer_desc() {
		return offer_desc;
	}

	public void setOffer_desc(String offer_desc) {
		this.offer_desc = offer_desc;
	}

}
