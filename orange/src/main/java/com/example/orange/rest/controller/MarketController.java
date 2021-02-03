package com.example.orange.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orange.domain.Market;
import com.example.orange.mapper.MarketMapper;
import com.example.orange.repository.MarketRepository;
import com.example.orange.service.MarketService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/markets")
public class MarketController {
	@Autowired
	private MarketRepository marketRepository;
	
	@Autowired
	private MarketService marketService;
	
	@Autowired
	private MarketMapper marketMapper;
	
	@GetMapping("/markets")
	public List<Market> listAllMarkets() {
		return marketService.listAllMarkets();
	}

	@GetMapping(value = "/markets/{marketID}")
	public ResponseEntity<Market> findMarket(@PathVariable("marketID") Integer marketID) {
		Market market = marketService.get(marketID);
		return ResponseEntity.ok().body(market);
	}

}