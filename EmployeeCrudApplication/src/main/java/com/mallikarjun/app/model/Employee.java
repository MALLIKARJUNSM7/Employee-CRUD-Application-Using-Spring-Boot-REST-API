package com.mallikarjun.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private long employeePhone;
	private String employeeLocation;
	private String employeeEmail;
	
	
	public Employee() {
		super();
	}


	public Employee(Long employeeId, String employeeFirstName, String employeeLastName, Long employeePhone,
			String employeeLocation, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeePhone = employeePhone;
		this.employeeLocation = employeeLocation;
		this.employeeEmail = employeeEmail;
	}
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public Long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(Long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeePhone=" + employeePhone + ", employeeLocation=" + employeeLocation
				+ ", employeeEmail=" + employeeEmail + "]";
	}
	
	
	
}
