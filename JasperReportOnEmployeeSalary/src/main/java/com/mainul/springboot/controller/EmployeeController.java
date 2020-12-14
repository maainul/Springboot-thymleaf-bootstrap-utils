package com.mainul.springboot.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mainul.springboot.model.Employee;
import com.mainul.springboot.service.EmployeeService;

import net.sf.jasperreports.engine.JRException;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "newEmployee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employeeList";
	}

	@GetMapping("/employeeList")
	public String viewEmployee(ModelMap model) {
		model.addAttribute("listEmployee", employeeService.getALlEmployees());
		return "employeeList";
	}

	@GetMapping("/report/{format}")
	public String exportReport(@PathVariable String format) throws FileNotFoundException, JRException {
		return employeeService.exportReport(format);
	}
}





