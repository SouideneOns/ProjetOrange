package com.example.orange.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.orange.domain.Contract;

public interface ContractRep extends CrudRepository<Contract, Long> {

	/**
	 * Case-insensitive search contracts where status like '%status%' Or coCode like
	 * '%coCode%' Or simID like '%simID%' Or offerID like '%offreID%' Or marketID like '%marketID%'
	 * @param coCode
	 * @param status
	 * @param simID
	 * @param offreID
	 * @return Iterable<Contract>
	 */
	Iterable<Contract>findByCoCodeContainingIgnoreCase(String coCode);
	Iterable<Contract>findBySimIDContainingIgnoreCase(String simID);
	Iterable<Contract>findByStatusContainingIgnoreCase(String Status);
	Iterable<Contract>findByCustomerIDContainingIgnoreCase(String customerID);
	
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCase(String coCode, String simID);
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndStatusContainingIgnoreCase(String coCode, String status);
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String coCode, String customerID);
	
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndStatusContainingIgnoreCase(String coCode, String simID,String status);
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String coCode, String simID,String customerID);
	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String coCode, String status,String customerID);
	
	Iterable<Contract> findBySimIDContainingIgnoreCaseAndStatusContainingIgnoreCase(String simID, String status);
	Iterable<Contract> findBySimIDContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String simID, String customerID);
	Iterable<Contract> findByStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String status, String customerID);
	

	Iterable<Contract> findByCoCodeContainingIgnoreCaseAndSimIDContainingIgnoreCaseAndStatusContainingIgnoreCaseAndCustomerIDContainingIgnoreCase(String coCode, String simID,String status,String customerID);

	
}