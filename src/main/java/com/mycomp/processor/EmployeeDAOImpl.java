package com.mycomp.processor;

import java.util.List;

import com.mycomp.db.EmployeeDB;
import com.mycomp.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	public List<Employee> getAllEmployees() {
		EmployeeDB employeeDB = new EmployeeDB();
		return employeeDB.getEmployeeList();
	}

	public Employee update(long id) {
		
		return null;
	}

	public void delete(long id) {
		
		
	}

	public void insert(Employee employee) {
		
		
	}
	
}