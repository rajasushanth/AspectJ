package com.mycomp.db;

import java.util.HashMap;
import java.util.Map;

import com.mycomp.dto.Appraisal;
import com.mycomp.dto.Employee;

public class AppraisalDB {
	
	private Map<Employee, Appraisal> appraisalMap = new HashMap<Employee, Appraisal>();

	public Map<Employee, Appraisal> getAppraisalMap() {
		return appraisalMap;
	}

	public void setAppraisalMap(Map<Employee, Appraisal> appraisalMap) {
		this.appraisalMap = appraisalMap;
	}


	public AppraisalDB() {
		double current = 1200000;
		double increment = 50000;
		String rating = "Average";
		int i = 0;
		EmployeeDB employeeDB = new EmployeeDB();
		for(Employee employee : employeeDB.getEmployeeList()){
			if(i == 1){
				current = 1100000;
				increment = 70000;
				rating = "Good";
			}else if(i == 2){
				current = 900000;
				increment = 90000;
				rating = "Outstanding";
			}
			appraisalMap.put(employee, new Appraisal(current, increment, rating));
		}
		
	}
	
	

}
