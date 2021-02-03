package com.example.orange.service;

import java.util.List;
import java.util.Optional;

import com.example.orange.domain.Customer;

public interface CustomerService {

	public List<Customer> listCustomers();

	public Customer saveOrUpdate(Customer customer);


	public Iterable <Customer> seachForCustomer1(String firstName);
	public Iterable <Customer> seachForCustomer2(String lastName);
	public Iterable <Customer> seachForCustomer3(String custCode);
	public Iterable <Customer> seachForCustomer4(String numIdentity);
	
	public Iterable <Customer> seachForCustomer5(String firstName, String lastName);
	public Iterable <Customer> seachForCustomer6(String firstName, String custCode);
	public Iterable <Customer> seachForCustomer7(String firstName, String numIdentity);
	public Iterable <Customer> seachForCustomer8(String firstName,String lastName, String custCode);
	
	public Iterable <Customer> seachForCustomer9(String firstName,String lastName,String numIdentity);
	public Iterable <Customer> seachForCustomer10(String firstName,String lastName, String custCode,String numIdentity);
	public Iterable <Customer> seachForCustomer11(String firstName,String custCode,String numIdentity);
	public Iterable <Customer> seachForCustomer12(String lastName,String custCode);

	public Iterable <Customer> seachForCustomer13(String lastName,String numIdentity);
	public Iterable <Customer> seachForCustomer14(String lastName,String custCode,String numIdentity);
	public Iterable <Customer> seachForCustomer15(String custCode,String numIdentity);
	

	public Customer get(long id);

}
