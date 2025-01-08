package com.wipro.abcmart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.wipro.abcmart.entity.Customer;
import com.wipro.abcmart.entity.User;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	List<Customer> findByCity(String city);
	
	@Query("select c from Customer c where c.email = :inputmail") // jpql
	Optional<Customer> findCustomerDetailsByEmail(@Param("inputmail") String email);	
			
}
