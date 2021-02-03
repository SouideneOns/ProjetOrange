package com.example.orange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.OfferF;

@Repository
public interface OfferRepositoryF extends JpaRepository<OfferF, Long> {
	
}
