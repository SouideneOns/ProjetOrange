package com.example.orange.service;

import java.util.List;

import com.example.orange.domain.OfferF;

public interface OfferServiceF {
	
	public List<OfferF>listAllOffers();
    public OfferF get(long offerID);
	
}
