package com.mksoft.practice.springmicroservicedashboardservice.proxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mksoft.practice.springmicroservicedashboardservice.model.EmployeeInfo;

@FeignClient("EmployeeSearch")
@RibbonClient("EmployeeSearch")
@RequestMapping(path="/employee")
public interface EmployeeSearchProxy {

	@GetMapping("/findAll")
	public Collection<EmployeeInfo> findAllEmployees();
	
	@GetMapping("/{id}")
	public EmployeeInfo findEmployee(@PathVariable Long id);
	
}
