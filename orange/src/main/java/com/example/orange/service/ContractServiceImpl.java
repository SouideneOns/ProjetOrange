package com.example.orange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orange.domain.Contract;
import com.example.orange.exception.InvalidIdException;
import com.example.orange.repository.ContractRep;
import com.example.orange.repository.ContractRepository;

@Service
@Transactional
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractRepository contractRepository;

	@Autowired
	private ContractRep contractRep;

	@Override
	public Contract get(long id) {
		Optional<Contract> contractOpt = contractRepository.findById(id);
		return contractOpt.orElseThrow(InvalidIdException::new);
	}
	
	@Override
	public Iterable<Contract> searchForCustomer(String customerID) {
		return contractRep
				.findByCustomerIDContainingIgnoreCase(customerID);
	}

	@Override
	public List<Contract> listContracts() {
		return contractRepository.findAll();
	}

	@Override
	public Contract saveOrUpdate(Contract contract) {
		return contractRepository.saveAndFlush(contract);
	}

	@Override
	public Iterable<Contract> seachForContract1(String coCode) {
		return contractRep.findByCoCodeContainingIgnoreCase(coCode);
	}

	@Override
	public Iterable<Contract> seachForContract2(String status) {
		
		return contractRep.findByStatusContainingIgnoreCase(status);
	}

	@Override
	public Iterable<Contract> seachForContract3(String simID) {
		
		return contractRep.findBySimIDContainingIgnoreCase(simID);
	}

	@Override
	public Iterable<Contract> seachForContract4(String customerID) {
		return contractRep.findByCustomerIDContainingIgnoreCase(customerID);
	}

	@Override
	public Iterable<Contract> seachForContract5(String coCode, String simID) {
		
		return contractRep.findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCase(coCode, simID);
	}

	@Override
	public Iterable<Contract> seachForContract6(String coCode, String status) {
		
		return contractRep.findByCoCodeContainingIgnoreCaseAndStatusContainingIgnoreCase(coCode, status);
	}

	@Override
	public Iterable<Contract> seachForContract7(String coCode, String customerID) {
		
		return contractRep.findByCoCodeContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(coCode, customerID);
	}

	@Override
	public Iterable<Contract> seachForContract8(String coCode, String simID, String status) {
		
		return contractRep.findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndStatusContainingIgnoreCase(coCode, simID, status);
	}

	@Override
	public Iterable<Contract> seachForContract9(String coCode, String simID, String customerID) {
		
		return contractRep.findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(coCode, simID, customerID);
	}

	@Override
	public Iterable<Contract> seachForContract10(String coCode, String status, String customerID) {
		return contractRep.findByCoCodeContainingIgnoreCaseAndStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(coCode, status, customerID);
		
	}

	@Override
	public Iterable<Contract> seachForContract11(String simID, String status) {
		return contractRep.findBySimIDContainingIgnoreCaseAndStatusContainingIgnoreCase(simID, status);
	}

	@Override
	public Iterable<Contract> seachForContract12(String simID, String customerID) {
		return contractRep.findBySimIDContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(simID, customerID);
	}

	@Override
	public Iterable<Contract> seachForContract13(String status, String customerID) {
		return contractRep.findByStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(status, customerID);
	}

	@Override
	public Iterable<Contract> seachForContract14(String coCode, String simID, String status, String customerID) {
		return contractRep.findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(coCode, simID, status, customerID);
	}

	


	


}
