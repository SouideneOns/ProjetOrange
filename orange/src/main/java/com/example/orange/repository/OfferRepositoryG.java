package com.example.orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.OfferG;

@Repository
public interface OfferRepositoryG extends JpaRepository<OfferG, Long> {
	
}
