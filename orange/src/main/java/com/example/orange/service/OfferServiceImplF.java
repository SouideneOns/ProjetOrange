package com.example.orange.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.orange.domain.OfferF;
import com.example.orange.repository.OfferRepositoryF;
import com.example.orange.exception.InvalidIdException;

@Service
@Transactional
public class OfferServiceImplF implements OfferServiceF {

	@Autowired
	
	private OfferRepositoryF offerRepository;

	
	@Override
	public OfferF get(long offerID) {
		Optional<OfferF> offerOpt = offerRepository.findById(offerID);
		return offerOpt.orElseThrow(InvalidIdException::new);
	}
	
	@Override
	public List<OfferF> listAllOffers() {
		return offerRepository.findAll();
	}


}
