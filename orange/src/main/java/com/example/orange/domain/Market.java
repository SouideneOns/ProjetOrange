package com.example.orange.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "markets")
public class Market {
	
	public long marketID;
	public String marketName;
	public String marketDesc;
	
	public Market(long marketID, String marketName, String marketDesc) {
		super();
		this.marketID = marketID;
		this.marketName = marketName;
		this.marketDesc = marketDesc;
	}
	public Market() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getMarketID() {
		return marketID;
	}
	public void setMarketID(long marketID) {
		this.marketID = marketID;
	}
	
	@Column(name = "marketrName", nullable = false)
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	
	@Column(name = "marketDesc", nullable = false)
	public String getMarketDesc() {
		return marketDesc;
	}
	public void setMarketDesc(String marketDesc) {
		this.marketDesc = marketDesc;
	}
	
	
}
