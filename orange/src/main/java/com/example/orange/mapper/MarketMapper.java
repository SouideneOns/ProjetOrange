package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orange.DTO.MarketDTO;
import com.example.orange.domain.Market;



@Component
public class MarketMapper {
	@Autowired
	private ModelMapper modelMapper;

	public MarketDTO convertToDto(Market market) {
		MarketDTO dto = modelMapper.map(market, MarketDTO.class);
		return dto;
	}

	public Market convertToEntity(MarketDTO dto) {
		Market market = modelMapper.map(dto, Market.class);
		return market;
	}

}
