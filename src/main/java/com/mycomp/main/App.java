package com.mycomp.main;

import com.mycomp.processor.EmployeeDAO;
import com.mycomp.processor.EmployeeDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//printMessage();
    	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    	employeeDAO.getAllEmployees();
    }
    
    public static void printMessage(){
    	System.out.println("Hello World!");
    }
    
}
