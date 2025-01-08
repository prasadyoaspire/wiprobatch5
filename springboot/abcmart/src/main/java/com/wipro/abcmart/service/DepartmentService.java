package com.wipro.abcmart.service;

import java.util.List;

import com.wipro.abcmart.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);
	Department getDepartmentDetails(int deptId);
	List<Department> getAllDepartments();
}
