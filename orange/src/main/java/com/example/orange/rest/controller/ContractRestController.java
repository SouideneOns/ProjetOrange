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
import com.example.orange.domain.Contract;
import com.example.orange.repository.ContractRep;
import com.example.orange.service.ContractService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/contracts")
public class ContractRestController {

	@Autowired
	private ContractService contractService;

	@Autowired
	private ContractRep contractRepository;
	
	


	@GetMapping("/contracts")
	public List<Contract> listContracts() {
		return contractService.listContracts();
	}

	@GetMapping(value = "/contracts/{id}")
	public ResponseEntity<Contract> findContract(@PathVariable("id") Integer id) {
		Contract contract = contractService.get(id);
		return ResponseEntity.ok().body(contract);
	}

	@PostMapping(value = "/contracts")
	public Contract createContract(@RequestBody Contract contract) {
		return contractService.saveOrUpdate(contract);
	}

	@PutMapping(value = "/contracts/{id}")
	public ResponseEntity<Contract> updateContract(@RequestBody Contract contract) {
		contractService.saveOrUpdate(contract);
		final Contract updateContract = contractService.saveOrUpdate(contract);
		return ResponseEntity.ok(updateContract);
	}
	
	@GetMapping("/searchc/{firstname}")
	public List<Contract> search(@PathVariable("firstname") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.searchForCustomer(customerID).forEach(contracts::add);
		return contracts;
	}

	@GetMapping("/search1/{coCode}")
	public List<Contract> seachForContract1(@PathVariable("coCode") String coCode) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract1(coCode).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search2/{status}")
	public List<Contract> seachForContract2(@PathVariable("status") String status) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract2(status).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search3/{simID}")
	public List<Contract> seachForContract3(@PathVariable("simID") String simID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract3(simID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search4/{customerID}")
	public List<Contract> seachForContract4(@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract4(customerID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search5/{coCode}/{simID}")
	public List<Contract> seachForCustomer5(@PathVariable("coCode") String coCode,@PathVariable("simID") String simID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract5(coCode,simID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search6/{coCode}/{status}")
	public List<Contract> seachForContract6(@PathVariable("coCode") String coCode,@PathVariable("status") String status) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract6(coCode,status).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search7/{coCode}/{customerID}")
	public List<Contract> seachForContract7(@PathVariable("coCode") String coCode,@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract7(coCode,customerID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search8/{coCode}/{simID}/{status}")
	public List<Contract> seachForContract8(@PathVariable("coCode") String coCode,@PathVariable("simID") String simID
			,@PathVariable("status") String status) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract8(coCode,simID,status).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search9/{coCode}/{simID}/{customerID}")
	public List<Contract> seachForContract9(@PathVariable("coCode") String coCode,@PathVariable("simID") String simID,
			@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract9(coCode,simID,customerID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search10/{coCode}/{status}/{customerID}")
	public List<Contract> seachForContract10(@PathVariable("coCode") String coCode,@PathVariable("status") String status,
			@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract10(coCode,status,customerID).forEach(contracts::add);
		return contracts;
	}

	@GetMapping("/search11/{simID}/{status}}")
	public List<Contract> seachForContract11(@PathVariable("simID") String simID,@PathVariable("status") String status) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract11(simID,status).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search12/{simID}/{customerID}")
	public List<Contract> seachForContract12(@PathVariable("simID") String simID,@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract12(simID,customerID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search13/{status}/{customerID}")
	public List<Contract> seachForContract13(@PathVariable("status") String status,@PathVariable("customerID") String customerID) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract13(status,customerID).forEach(contracts::add);
		return contracts;
	}
	
	@GetMapping("/search14/{coCode}/{simID}/{status}/{customerID}")
	public List<Contract> seachForContract14(@PathVariable("coCode") String coCode,@PathVariable("simID") String simID,
			@PathVariable("status") String status,@PathVariable("customerID") String customerID ) {

		List<Contract> contracts = new ArrayList<>();
		this.contractService.seachForContract14(coCode,simID,status,customerID).forEach(contracts::add);
		return contracts;
	}
	
	

}
