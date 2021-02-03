package com.example.orange.service;

import java.util.List;

import com.example.orange.domain.Contract;

public interface ContractService {

	public List<Contract> listContracts();

	public Contract saveOrUpdate(Contract contract);
	public Iterable <Contract> searchForCustomer(String customerID);

	public Iterable<Contract> seachForContract1(String coCode);
	public Iterable<Contract> seachForContract2(String status);
	public Iterable<Contract> seachForContract3(String simID);
	public Iterable<Contract> seachForContract4(String customerID);
	
	public Iterable<Contract> seachForContract5(String coCode, String simID);
	public Iterable<Contract> seachForContract6(String coCode, String status);
	public Iterable<Contract> seachForContract7(String coCode, String customerID);
	
	public Iterable<Contract> seachForContract8(String coCode, String simID,String status);
	public Iterable<Contract> seachForContract9(String coCode, String simID,String customerID);
	public Iterable<Contract> seachForContract10(String coCode, String status,String customerID);
	
	
	public Iterable<Contract> seachForContract11(String simID, String status);
	public Iterable<Contract> seachForContract12(String simID, String customerID);
	public Iterable<Contract> seachForContract13(String status, String customerID);
	
	public Iterable<Contract> seachForContract14(String coCode, String simID,String status,String customerID);
	
	public Contract get(long id);

}
