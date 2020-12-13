package com.mainul.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainul.springboot.model.Employee;
import com.mainul.springboot.repository.EmployeeRepository;
import com.mainul.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);

	}

	@Override
	public List<Employee> getALlEmployees() {
		List<Employee> resultEmployees = employeeRepository.findAll();
		return resultEmployees;
	}
}