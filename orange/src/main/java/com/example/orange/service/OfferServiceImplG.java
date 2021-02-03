package com.example.orange.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orange.domain.OfferG;
import com.example.orange.repository.OfferRepositoryG;
import com.example.orange.exception.InvalidIdException;

@Service
@Transactional
public class OfferServiceImplG implements OfferServiceG {

	@Autowired
	
	private OfferRepositoryG offerRepository;

	
	@Override
	public OfferG get(long offerID) {
		Optional<OfferG> offerOpt = offerRepository.findById(offerID);
		return offerOpt.orElseThrow(InvalidIdException::new);
	}
	
	@Override
	public List<OfferG> listAllOffers() {
		
		return offerRepository.findAll();
	}


}
