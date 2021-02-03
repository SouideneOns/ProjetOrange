package com.example.orange.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orange.domain.Customer;
import com.example.orange.mapper.CustomerMapper;
import com.example.orange.repository.CustomerRepository;
import com.example.orange.service.CustomerService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	

	@Autowired
	private CustomerRepository customerRepository;


	@Autowired
	CustomerMapper customerMapper;

	@GetMapping("/customers")
	public List<Customer> listCustomers() {
		return customerService.listCustomers();
	}

	@GetMapping(value = "/customers/{id}")
	public ResponseEntity<Customer> findCustomer(@PathVariable("id") Integer id) {
		Customer customer = customerService.get(id);
		return ResponseEntity.ok().body(customer);
	}

	@PostMapping(value = "/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.saveOrUpdate(customer);
	}
	
	
	@PutMapping(value = "/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		customerService.saveOrUpdate(customer);
		final Customer updateCustomer = customerService.saveOrUpdate(customer);
		return ResponseEntity.ok(updateCustomer);
	}

	@GetMapping("/search1/{firstname}")
	public List<Customer> seachForCustomer(@PathVariable("firstname") String firstname) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer1(firstname).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search2/{lastname}")
	public List<Customer> seachForCustomer2(@PathVariable("lastname") String lastname) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer2(lastname).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search3/{custcode}")
	public List<Customer> seachForCustomer3(@PathVariable("custcode") String custcode) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer3(custcode).forEach(customers::add);
		return customers;
	}
	@GetMapping("/search4/{numidentity}")
	public List<Customer> seachForCustomer4(@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer4(numidentity).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search5/{firstname}/{lastname}")
	public List<Customer> seachForCustomer5(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer5(firstname,lastname).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search6/{firstname}/{custcode}")
	public List<Customer> seachForCustomer6(@PathVariable("firstname") String firstname,@PathVariable("custcode") String custcode) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer6(firstname,custcode).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search7/{firstname}/{numidentity}")
	public List<Customer> seachForCustomer7(@PathVariable("firstname") String firstname,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer7(firstname,numidentity).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search8/{firstname}/{lastname}/{custcode}")
	public List<Customer> seachForCustomer8(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname
			,@PathVariable("custcode") String custcode) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer8(firstname,lastname,custcode).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search9/{firstname}/{lastname}/{numidentity}")
	public List<Customer> seachForCustomer9(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer9(firstname,lastname,numidentity).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search10/{firstname}/{lastname}/{custcode}/{numidentity}")
	public List<Customer> seachForCustomer10(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname,@PathVariable("custcode") String custcode,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer10(firstname,lastname,custcode,numidentity).forEach(customers::add);
		return customers;
	}

	@GetMapping("/search11/{firstname}/{custcode}/{numidentity}")
	public List<Customer> seachForCustomer11(@PathVariable("firstname") String firstname,@PathVariable("custcode") String custcode,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer11(firstname,custcode,numidentity).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search12/{lastname}/{custcode}")
	public List<Customer> seachForCustomer12(@PathVariable("lastname") String lastname,@PathVariable("custcode") String custcode) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer12(lastname,custcode).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search13/{lastname}/{numIdentity}")
	public List<Customer> seachForCustomer13(@PathVariable("lastname") String lastname,@PathVariable("numIdentity") String numIdentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer13(lastname,numIdentity).forEach(customers::add);
		return customers;
	}
	
	@GetMapping("/search14/{lastname}/{custcode}/{numidentity}")
	public List<Customer> seachForCustomer14(@PathVariable("lastname") String lastname,@PathVariable("custcode") String custcode,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer14(lastname,custcode,numidentity).forEach(customers::add);
		return customers;
	}

	@GetMapping("/search15/{custcode}/{numidentity}")
	public List<Customer> seachForCustomer15(@PathVariable("custcode") String custcode,@PathVariable("numidentity") String numidentity) {

		List<Customer> customers = new ArrayList<>();
		this.customerService.seachForCustomer15(custcode,numidentity).forEach(customers::add);
		return customers;
	}
	

	@GetMapping(value = "/searchf/{custCode}")
	public List<Customer> seachForCustomerC(@PathVariable String custCode) {
		return customerRepository.findByCustCode(custCode);
	}

}
