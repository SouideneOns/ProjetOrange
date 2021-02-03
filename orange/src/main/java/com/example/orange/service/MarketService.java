package com.example.orange.service;

import java.util.List;

import com.example.orange.domain.Market;


public interface MarketService {
	public List<Market>listAllMarkets();
    public Market get(long marketID);

}

