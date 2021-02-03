package com.example.orange.service;

import java.util.List;

import com.example.orange.domain.OfferG;


public interface OfferServiceG {
	
	public List<OfferG>listAllOffers();
    public OfferG get(long offerID);
	
}
