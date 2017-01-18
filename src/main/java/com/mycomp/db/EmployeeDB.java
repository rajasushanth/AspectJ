package com.mycomp.db;

import java.util.ArrayList;
import java.util.List;

import com.mycomp.dto.Address;
import com.mycomp.dto.Employee;

public class EmployeeDB {
	
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	

	public List<Employee> getEmployeeList() {
		return employeeList;
	}



	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}



	public EmployeeDB() {
		
		Address address1 = new Address("Street 1", "Street 2", "Chennai", "TN", 600123);
		Address address2 = new Address("Street 1", "Street 2", "Pune", "MH", 508123);
		Address address3 = new Address("Street 1", "Street 2", "Mumbai", "MH", 509123);
		
		Employee employee1 = new Employee(5540, "Sansa Stark", address1);
		Employee employee2 = new Employee(5540, "Brandit Stark", address2);
		Employee employee3 = new Employee(5540, "Arya Stark", address3);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		System.out.println(employee1.toString());
	}
	
	

}
