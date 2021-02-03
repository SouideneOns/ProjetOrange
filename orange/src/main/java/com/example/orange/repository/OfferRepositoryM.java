package com.example.orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.OfferM;

@Repository
public interface OfferRepositoryM extends JpaRepository<OfferM, Long> {

}
