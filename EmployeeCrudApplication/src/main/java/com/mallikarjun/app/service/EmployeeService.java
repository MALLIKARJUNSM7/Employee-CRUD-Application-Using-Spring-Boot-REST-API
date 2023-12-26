package com.mallikarjun.app.service;

import java.util.List;

import com.mallikarjun.app.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> listEmployee();

	Employee fetchEmployeeById(Long id);

	String deleteEmployee(Long id);

	Employee editEmployee(Long id, Employee employee);

}
