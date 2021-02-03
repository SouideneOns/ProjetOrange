package com.example.orange.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.orange.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByCustCode(String custCode);

	List<Customer> findByLastName(String lastname);

	@Query("SELECT customer FROM Customer customer WHERE customer.custCode LIKE :custCodeLike")
	Page<Customer> performSearchByCustCode(@Param("custCodeLike") long custCodeLike, Pageable pageable);


}
