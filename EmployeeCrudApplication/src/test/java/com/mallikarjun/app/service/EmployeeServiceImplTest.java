package com.mallikarjun.app.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockitoSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mallikarjun.app.model.Employee;
import com.mallikarjun.app.repository.EmployeeRepository;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = EmployeeServiceImpl.class)
@EnableAutoConfiguration
@ContextConfiguration(classes = { EmployeeServiceImpl.class })
class EmployeeServiceImplTest {

//	int x;
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@MockBean
	EmployeeRepository employeeRepo;

	@Test
	void addEmployeeTest() {

		Employee employee = new Employee();
		employee.setEmployeeFirstName("Arjun");
		employee.setEmployeeLastName("M");
		employee.setEmployeePhone(7975314357L);
		employee.setEmployeeLocation("arjun81002gmail.com");
		employee.setEmployeeEmail("Bangalore");

		Mockito.when(employeeRepo.save(employee)).thenReturn(employee);
		assertThat(employeeServiceImpl.addEmployee(employee)).isEqualTo(employee);

	}

	@Test
	void listEmployeeTest() {

		Employee employee1 = new Employee();
		employee1.setEmployeeFirstName("Arjun");
		employee1.setEmployeeLastName("M");
		employee1.setEmployeePhone(7975314357L);
		employee1.setEmployeeLocation("arjun81002gmail.com");
		employee1.setEmployeeEmail("Bangalore");

		Employee employee2 = new Employee();
		employee2.setEmployeeFirstName("Ravi");
		employee2.setEmployeeLastName("P");
		employee2.setEmployeePhone(7975314389L);
		employee2.setEmployeeLocation("Bangalore");
		employee2.setEmployeeEmail("ravi@12gmail.com");

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);

		Mockito.when(employeeServiceImpl.listEmployee()).thenReturn(employeeList);
		assertThat(employeeServiceImpl.listEmployee()).isEqualTo(employeeList);

	}

	@Test
	void fetchEmployeeById() {
		Employee employee3 = new Employee();
		employee3.setEmployeeId(1L);
		Mockito.when(employeeRepo.save(employee3)).thenReturn(employee3);
		assertThat(employeeRepo.getById(employee3.getEmployeeId()));
		
	}

	
	

}
