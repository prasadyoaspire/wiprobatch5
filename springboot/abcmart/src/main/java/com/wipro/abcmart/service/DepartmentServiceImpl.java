package com.wipro.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.Department;
import com.wipro.abcmart.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public Department saveDepartment(Department department) {
		
		return deptRepository.save(department);
	}

	@Override
	public Department getDepartmentDetails(int deptId) {
		
		Optional<Department> optionalDept = deptRepository.findById(deptId);
		if(optionalDept.isEmpty()) {
			
		}
		
		Department dept = optionalDept.get();
		return dept;
	}

	@Override
	public List<Department> getAllDepartments() {
		
		return deptRepository.findAll();
	}

}
