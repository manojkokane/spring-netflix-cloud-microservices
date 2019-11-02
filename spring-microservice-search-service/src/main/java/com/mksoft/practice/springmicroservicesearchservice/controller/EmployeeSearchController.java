package com.mksoft.practice.springmicroservicesearchservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mksoft.practice.springmicroservicesearchservice.model.Employee;
import com.mksoft.practice.springmicroservicesearchservice.service.EmployeeSearchService;

@RestController
@RequestMapping(path="/employee")
public class EmployeeSearchController {

	@Autowired
	EmployeeSearchService service;
	
	@GetMapping("/findAll")
	public Collection<Employee> findAllEmployees() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Employee findEmployee(@PathVariable final Long id) {
		return service.findById(id);
	}
}
