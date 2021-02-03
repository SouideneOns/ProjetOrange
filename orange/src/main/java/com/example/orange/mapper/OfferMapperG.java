package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.orange.DTO.OfferDTOG;
import com.example.orange.domain.OfferG;

import lombok.extern.slf4j.Slf4j;
@Component
public class OfferMapperG {

	@Autowired
	private ModelMapper modelMapper;

	public OfferDTOG convertToDto(OfferG offer) {
		OfferDTOG dto = modelMapper.map(offer, OfferDTOG.class);
		return dto;
	}

	public OfferG convertToEntity(OfferDTOG dto) {
		OfferG offer = modelMapper.map(dto, OfferG.class);
		return offer;
	}
		
	}