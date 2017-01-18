package com.mycomp.processor;

import java.util.Map;

import com.mycomp.db.AppraisalDB;
import com.mycomp.dto.Appraisal;
import com.mycomp.dto.Employee;

public class AppraisalDAOImpl implements AppraisalDAO {

	public Map<Employee, Appraisal> getAllResults() {
		AppraisalDB appraisalDB = new AppraisalDB();
		return appraisalDB.getAppraisalMap();
	}

	public Appraisal update(long id) {
		
		return null;
	}

	public void delete(long id) {
		
		
	}

	public void insert(Appraisal appraisal) {
		
		
	}

}
