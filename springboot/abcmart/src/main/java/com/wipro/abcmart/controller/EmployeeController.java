package com.wipro.abcmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.abcmart.entity.Employee;
import com.wipro.abcmart.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		empService.saveEmployee(employee);	
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<Employee> fetchEmployeeDetails(@PathVariable int empId) {
		
		Employee emp = empService.getEmployeeDetails(empId);		
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<List<Employee>> fetchAllEmployees() {
		
		List<Employee> empList = empService.getAllEmployees();		
		return new ResponseEntity<>(empList,HttpStatus.OK);
	}
}
