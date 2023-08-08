package com.employeetest.service;

import java.util.List;

import com.employeetest.domain.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee , Integer id);
	public Employee deleteEmployee(Integer id);
	public List<Employee> findAll();
	public Employee find(Integer id);
	

}
