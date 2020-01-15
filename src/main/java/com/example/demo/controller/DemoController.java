package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Organization;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.OrganizationService;

import lombok.Data;

@RestController
@Data
public class DemoController {
	
	@Autowired
	private EmployeeService employeeService; 
	
	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping("/test")
	public String testApi() {
		return "success";
	}
	
	@PostMapping("/create-org")
	public Organization createOrganization(@RequestBody Organization organization) {
		return organizationService.createOrganization(organization);
	}
	
	@PutMapping("/update-org")
	public String updateOrganization() {
		return "success";
	}
	
	@PostMapping("/create-emp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/update-emp")
	public String updateEmployee() {
		return "success";
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee() {
		return "success";
	}
	
	@GetMapping("/fetch")
	public String fetchEmployee() {
		return "success";
	}

}
