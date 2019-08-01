package com.risk.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class EmployeeDetails {

	@Id
	private Integer employeeId;
	private String name;
	private Integer age;
	@Email
	@NotEmpty
	private String email;
	private String phone;
	@NotEmpty
	private String password;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeDetails(Integer employeeId, String name, Integer age, String email, String phone, String password) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public EmployeeDetails() {
		
	}


}
