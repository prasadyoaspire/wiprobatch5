package com.wipro.abcmart.service;

import java.util.List;

import com.wipro.abcmart.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp,int deptId);
	Employee getEmployeeDetails(int empId);
	List<Employee> getAllEmployees();
}
