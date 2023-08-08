package com.employeetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeetest.domain.Employee;
import com.employeetest.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		Employee emp= employeeRepository.findById(id).get();
		employeeRepository.deleteById(id);
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> emp= employeeRepository.findAll();
		return emp;
	}

	@Override
	public Employee find(Integer id) {
		return employeeRepository.findById(id).get();
	}

	



	
}
