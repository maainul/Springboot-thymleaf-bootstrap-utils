package com.mainul.springboot.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.mainul.springboot.model.Employee;

import net.sf.jasperreports.engine.JRException;

public interface EmployeeService {
	void saveEmployee(Employee employee);

	List<Employee> getALlEmployees();
	
	String exportReport(String fileFormat) throws FileNotFoundException, JRException ;

}
