package com.example.orange.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.orange.domain.Customer;

public interface CustomerRep extends CrudRepository<Customer, Long> {

	/**
	 * Case-insensitive search customers where lastName like '%lastName%' Or firstName
	 * like '%firstName%' Or custCode like '%custCode%' Or identity like
	 * '%identity%' Or id like '%id%'
	 * 
	 * @param firstName
	 * @param lastName
	 * @param custCode
	 * @param numIdentity
	 * @param id
	 * @return Iterable<Customer>
	 */
	
	Iterable<Customer> findByFirstNameContainingIgnoreCase(String firstName);
	Iterable<Customer> findByLastNameContainingIgnoreCase(String lastName);
	Iterable<Customer> findByCustCodeContainingIgnoreCase(String custCode);
	Iterable<Customer> findByNumIdentityContainingIgnoreCase(String numIdentity);
	
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(String firstName, String lastName);
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(String firstName, String custCode);
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String firstName, String numIdentity);
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(String firstName, String lastName,String custCode);
	
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String firstName, String lastName,String numIdentity);
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String firstName, String custCode,String numIdentity);
	Iterable<Customer> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String firstName, String lastName,String custCode,String numIdentity);
	Iterable<Customer> findByLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCase(String lastName, String custCode);
	
	Iterable<Customer> findByLastNameContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String lastName, String numIdentity);
	Iterable<Customer> findByLastNameContainingIgnoreCaseAndCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String lastName, String custCode,String numIdentity);
	Iterable<Customer> findByCustCodeContainingIgnoreCaseAndNumIdentityContainingIgnoreCase(String custCode, String numIdentity);
}
