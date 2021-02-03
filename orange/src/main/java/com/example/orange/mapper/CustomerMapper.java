package com.example.orange.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orange.DTO.CustomerDTO;
import com.example.orange.domain.Customer;

@Component
public class CustomerMapper {

	@Autowired
	private ModelMapper modelMapper;

	public CustomerDTO convertToDto(Customer customer) {
		CustomerDTO dto = modelMapper.map(customer, CustomerDTO.class);
		return dto;
	}

	public Customer convertToEntity(CustomerDTO dto) {
		Customer customer = modelMapper.map(dto, Customer.class);
		return customer;
	}

}
