package com.mainul.springboot.service;

import java.util.List;

import com.mainul.springboot.model.Employee;

public interface EmployeeService {
	void saveEmployee(Employee employee);

	List<Employee> getALlEmployees();

}
