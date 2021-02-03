package com.example.orange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orange.domain.Market;
import com.example.orange.exception.InvalidIdException;
import com.example.orange.repository.MarketRepository;


@Service
@Transactional
public class MarketServiceImpl implements MarketService{
	
	@Autowired
	private MarketRepository marketRepository;
	

	@Override
	public Market get(long marketID) {
		
		Optional<Market> marketOpt = marketRepository.findById(marketID);
		return marketOpt.orElseThrow(InvalidIdException::new);
	}
	
	@Override
	public List<Market> listAllMarkets() {
		
		return marketRepository.findAll();
	}

}

