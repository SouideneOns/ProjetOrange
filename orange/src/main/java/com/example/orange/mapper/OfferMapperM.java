package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.orange.DTO.OfferDTOM;
import com.example.orange.domain.OfferM;

import lombok.extern.slf4j.Slf4j;
@Component
public class OfferMapperM {

	@Autowired
	private ModelMapper modelMapper;

	public OfferDTOM convertToDto(OfferM offer) {
		OfferDTOM dto = modelMapper.map(offer, OfferDTOM.class);
		return dto;
	}

	public OfferM convertToEntity(OfferDTOM dto) {
		OfferM offer = modelMapper.map(dto, OfferM.class);
		return offer;
	}
		
	}