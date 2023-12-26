//package com.mallikarjun.app.repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.mallikarjun.app.model.Employee;
//import com.mallikarjun.app.service.EmployeeService;
//
//@DataJpaTest
//class EmployeeRepositoryTest {
//	
//	@Mock
//	public EmployeeRepository data;
//	private MockMvc mockmvc;
//    @InjectMocks EmployeeService service;
//    @BeforeAll public void setup() {
//    	MockitoAnnotations.initMocks(this);
//    	mockmvc=MockMvcBuilders.standaloneSetup(null)
//    }
//	//SaveEmployee
//	@Test
//	public void saveemployee() {
//		
//		Employee emp = new Employee(1L,"Mallikarjun","M",7975314357L,"mallikarjun8100@gmail.com","Bangalore");
//		data.save(emp);
//		when(data.save(emp)).thenReturn(emp);
//		Employee employee1=	service.addEmployee(emp); 
//		
//
////		assertThat(emp.getEmployeeId()).isGreaterThan(0);
//		
//		assertEquals(1L, employee1.getEmployeeId());
//		
//	}
//
//	
//	//GetEmployee
//	@Test
//	public void reademployee() {
//		
////		Employee employee= data.getById(1L);
//		
//		Employee employee =data.findById(1L).get();
//		
//		assertThat(employee.getEmployeeId()).isEqualTo(1);
//	}
//	
//	
//	
//	
//	
//	
//}
