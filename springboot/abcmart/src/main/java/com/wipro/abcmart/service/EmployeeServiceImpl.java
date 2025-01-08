package com.wipro.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.Department;
import com.wipro.abcmart.entity.Employee;
import com.wipro.abcmart.repository.DepartmentRepository;
import com.wipro.abcmart.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public Employee saveEmployee(Employee emp,int deptId) {
				
		Optional<Department> optionalDept = deptRepository.findById(deptId);		
		if(optionalDept.isEmpty()) {
			//throw department not found exception
		}		
		Department dept = optionalDept.get();
		
		emp.setDept(dept);
		
		return empRepository.save(emp);
	}

	@Override
	public Employee getEmployeeDetails(int empId) {
		
		Optional<Employee> optionalEmp = empRepository.findById(empId);
		if(optionalEmp.isEmpty()) {
			
		}
		
		Employee emp = optionalEmp.get();
		return emp;
		
	}

	@Override
	public List<Employee> getAllEmployees() {

		return empRepository.findAll();
	}

}
