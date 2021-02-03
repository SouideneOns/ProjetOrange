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

import com.example.orange.domain.OfferF;
import com.example.orange.domain.OfferG;
import com.example.orange.domain.OfferM;
import com.example.orange.mapper.OfferMapperF;
import com.example.orange.mapper.OfferMapperG;
import com.example.orange.mapper.OfferMapperM;
import com.example.orange.repository.OfferRepositoryF;
import com.example.orange.repository.OfferRepositoryG;
import com.example.orange.repository.OfferRepositoryM;
import com.example.orange.service.OfferServiceF;
import com.example.orange.service.OfferServiceG;
import com.example.orange.service.OfferServiceM;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/offers")
public class OfferRestController {
	
	@Autowired
	private OfferRepositoryF offerRepositoryF;
	
	@Autowired
	private OfferServiceF offerServiceF;
	
	@Autowired
	private OfferMapperF offerMapperF;
	
	@Autowired
	private OfferRepositoryM offerRepositoryM;
	
	@Autowired
	private OfferServiceM offerServiceM;
	
	@Autowired
	private OfferMapperM offerMapperM;
	
	@Autowired
	private OfferRepositoryG offerRepositoryG;
	
	@Autowired
	private OfferServiceG offerServiceG;
	
	@Autowired
	private OfferMapperG offerMapperG;


	
	@GetMapping("/offersF")
	public List<OfferF> listAllOffersF() {
		return offerServiceF.listAllOffers();
	}

	@GetMapping(value = "/offersF/{offerID}")
	public ResponseEntity<OfferF> findOfferF(@PathVariable("OfferID") Integer offerID) {
		OfferF offer = offerServiceF.get(offerID);
		return ResponseEntity.ok().body(offer);
	}
	
	@GetMapping("/offersM")
	public List<OfferM> listAllOffersM() {
		return offerServiceM.listAllOffers();
	}

	@GetMapping(value = "/offersM/{offerID}")
	public ResponseEntity<OfferM> findOfferM(@PathVariable("OfferID") Integer offerID) {
		OfferM offer = offerServiceM.get(offerID);
		return ResponseEntity.ok().body(offer);
	}
	
	@GetMapping("/offersG")
	public List<OfferG> listAllOffersG() {
		return offerServiceG.listAllOffers();
	}

	@GetMapping(value = "/offersG/{offerID}")
	public ResponseEntity<OfferG> findOfferG(@PathVariable("OfferID") Integer offerID) {
		OfferG offer = offerServiceG.get(offerID);
		return ResponseEntity.ok().body(offer);
	}

	
}
