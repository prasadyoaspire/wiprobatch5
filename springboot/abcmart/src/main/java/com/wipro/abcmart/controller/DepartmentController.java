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

import com.wipro.abcmart.entity.Department;
import com.wipro.abcmart.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/save")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
		
		deptService.saveDepartment(department);		
		return new ResponseEntity<>(department,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{deptId}")
	public ResponseEntity<Department> fetchDepartmentDetails(@PathVariable int deptId) {
		
		Department dept = deptService.getDepartmentDetails(deptId);		
		return new ResponseEntity<>(dept,HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<List<Department>> fetchAllDepartments() {
		
		List<Department> deptList = deptService.getAllDepartments();		
		return new ResponseEntity<>(deptList,HttpStatus.OK);
	}
}
