package com.mallikarjun.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallikarjun.app.model.Employee;
import com.mallikarjun.app.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		Employee addEmployee = employeeService.addEmployee(employee);
		return addEmployee;
		
	}
	
	@GetMapping("/employee")
	public List<Employee> listEmployee()
	{
		return employeeService.listEmployee();
	}
	
	
	@GetMapping("/employee/{employeeId}")
	public Employee fetchEmployeeById(@PathVariable("employeeId") Long id)
	{
		return employeeService.fetchEmployeeById(id);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") Long id)
	{
		
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/employee/{employeeId}")
	public Employee editEmployee(@PathVariable("employeeId") Long id,@RequestBody Employee employee)
	{
		
		return employeeService.editEmployee(id,employee);
	}
	
}
