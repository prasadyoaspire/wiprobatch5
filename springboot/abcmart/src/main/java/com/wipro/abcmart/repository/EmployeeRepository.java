package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.abcmart.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
