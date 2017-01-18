package com.mycomp.processor;

import java.util.Map;

import com.mycomp.dto.Appraisal;
import com.mycomp.dto.Employee;

public interface AppraisalDAO {
	
	public Map<Employee, Appraisal> getAllResults();
	
	public Appraisal update(long id);
	
	public void delete(long id);
	
	public void insert(Appraisal appraisal);
}
