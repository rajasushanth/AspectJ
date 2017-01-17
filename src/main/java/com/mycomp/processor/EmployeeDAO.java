package com.mycomp.processor;

import java.util.List;

import com.mycomp.dto.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();
	
	public Employee update(long id);
	
	public void delete(long id);
	
	public void insert(Employee employee);
	
	
}
