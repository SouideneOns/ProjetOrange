package com.example.orange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orange.domain.Customer;
import com.example.orange.exception.InvalidCodeException;
import com.example.orange.exception.InvalidIdException;
import com.example.orange.repository.CustomerRep;
import com.example.orange.repository.CustomerRepository;

import lombok.var;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerRep customerRep;

	@Override
	public Customer get(long id) {
		Optional<Customer> customerOpt = customerRepository.findById(id);
		return customerOpt.orElseThrow(InvalidIdException::new);
	}

	@Override
	public List<Customer> listCustomers() {
		return customerRepository.findAll();
	}
	

	@Override
	public Customer saveOrUpdate(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}

	@Override
	public Iterable<Customer> seachForCustomer1(String firstName) {
		return customerRep
				.findByFirstNameContainingIgnoreCase(firstName);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer2(String lastName) {
		return customerRep
				.findByLastNameContainingIgnoreCase(lastName);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer3(String custCode) {
		return customerRep
				.findByCustCodeContainingIgnoreCase(custCode);
	}
	

	@Override
	public Iterable<Customer> seachForCustomer4(String numIdentity) {
		return customerRep
				.findByNumIdentityContainingIgnoreCase(numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer5(String firstName,String lastName) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(firstName, lastName);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer6(String firstName,String custCode) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(firstName, custCode);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer7(String firstName,String numIdentity) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(firstName,numIdentity);
	}
	

	@Override
	public Iterable<Customer> seachForCustomer8(String firstName,String lastName,String custCode) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(firstName, lastName, custCode);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer9(String firstName,String lastName,String numIdentity) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(firstName, lastName, numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer10(String firstName,String lastName,String custCode,String numIdentity) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(firstName, lastName, custCode, numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer11(String firstName,String custCode,String numIdentity) {
		return customerRep
				.findByFirstNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(firstName, custCode, numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer12(String lastName,String custCode) {
		return customerRep
				.findByLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(lastName, custCode);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer13(String lastName,String numIdentity) {
		return customerRep
				.findByLastNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(lastName, numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer14(String lastName,String custCode,String numIdentity) {
		return customerRep
				.findByLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(lastName, custCode, numIdentity);
	}
	
	@Override
	public Iterable<Customer> seachForCustomer15(String custCode,String numIdentity) {
		return customerRep
				.findByCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(custCode, numIdentity);
	}

}
