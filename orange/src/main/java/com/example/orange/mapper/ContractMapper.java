package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.orange.DTO.ContractDTO;
import com.example.orange.domain.Contract;

public class ContractMapper {

	@Autowired
	private ModelMapper modelMapper;

	public ContractDTO convertToDto(Contract contract) {
		ContractDTO dto = modelMapper.map(contract, ContractDTO.class);
		return dto;
	}

	public Contract convertToEntity(ContractDTO dto) {
		Contract contract = modelMapper.map(dto, Contract.class);
		return contract;
	}

}
