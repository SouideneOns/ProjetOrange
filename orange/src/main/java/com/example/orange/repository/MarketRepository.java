package com.example.orange.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.Market;
@Repository
public interface MarketRepository extends JpaRepository<Market, Long>{
   List<Market> findByMarketName(String marketName);
	
	@Query("SELECT market FROM Market market WHERE market.marketName LIKE :marketNameLike")
	Page<Market> performSearchByOffer(@Param("marketNameLike") String marketNameLike, Pageable pageable);
}


