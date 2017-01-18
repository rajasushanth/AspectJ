package com.mycomp.main;

import com.mycomp.processor.AppraisalDAO;
import com.mycomp.processor.AppraisalDAOImpl;
import com.mycomp.processor.EmployeeDAO;
import com.mycomp.processor.EmployeeDAOImpl;


public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    	employeeDAO.getAllEmployees();
    	AppraisalDAO appraisalDAO = new AppraisalDAOImpl();
    	appraisalDAO.getAllResults();
    }
    
}
