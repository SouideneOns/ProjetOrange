package com.example.orange.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.Contract;
import com.example.orange.domain.Customer;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

	List<Contract> findByCoCode(String coCode);

	@Query("SELECT contract FROM Contract contract WHERE contract.coCode LIKE :coCodeLike")
	Page<Contract> performSearchByCoCode(@Param("coCodeLike") long coCodeLike, Pageable pageable);
}


