package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.orange.DTO.OfferDTOF;
import com.example.orange.domain.OfferF;

import lombok.extern.slf4j.Slf4j;
@Component
public class OfferMapperF {

	@Autowired
	private ModelMapper modelMapper;

	public OfferDTOF convertToDto(OfferF offer) {
		OfferDTOF dto = modelMapper.map(offer, OfferDTOF.class);
		return dto;
	}

	public OfferF convertToEntity(OfferDTOF dto) {
		OfferF offer = modelMapper.map(dto, OfferF.class);
		return offer;
	}
		
	}