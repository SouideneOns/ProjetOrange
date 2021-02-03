package com.example.orange.service;

import java.util.List;

import com.example.orange.domain.OfferM;

public interface OfferServiceM {
	
	public List<OfferM>listAllOffers();
    public OfferM get(long offerID);
	
}
