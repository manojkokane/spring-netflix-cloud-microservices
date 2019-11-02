package com.mksoft.practice.springmicroservicedashboardservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mksoft.practice.springmicroservicedashboardservice.model.EmployeeInfo;
import com.mksoft.practice.springmicroservicedashboardservice.proxy.EmployeeSearchProxy;

@RestController
@RequestMapping("/dashboard")
public class EmployeeSearchProxyController {

	@Autowired
	EmployeeSearchProxy proxy;
	
	@GetMapping("/employee/findAll")
	public Collection<EmployeeInfo> findAllEmployees() {
		return proxy.findAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public EmployeeInfo findEMployee(@PathVariable Long id) {
		return proxy.findEmployee(id);
	}
}
