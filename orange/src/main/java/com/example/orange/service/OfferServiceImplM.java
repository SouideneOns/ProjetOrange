package com.example.orange.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orange.domain.OfferM;
import com.example.orange.repository.OfferRepositoryM;
import com.example.orange.exception.InvalidIdException;

@Service
@Transactional
public class OfferServiceImplM implements OfferServiceM {

	@Autowired
	
	private OfferRepositoryM offerRepository;

	
	@Override
	public OfferM get(long offerID) {
		Optional<OfferM> offerOpt = offerRepository.findById(offerID);
		return offerOpt.orElseThrow(InvalidIdException::new);
	}
	
	@Override
	public List<OfferM> listAllOffers() {
		
		return offerRepository.findAll();
	}

}
