package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.abcmart.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
