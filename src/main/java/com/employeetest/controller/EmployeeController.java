package com.employeetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeetest.domain.Employee;
import com.employeetest.service.EmployeeService;

@RequestMapping("/api/auth")	
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public String check() {
		return "Inside system";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return (employeeService.addEmployee(employee));
	}
//	public Employee updateEmployee(Employee employee , Integer id);
//	public Employee deleteEmployee(Integer id);
//	public List<Employee> findAll();
//	public Employee find(Integer id);
	
    @PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee ,@PathVariable Integer id) {
      employee.setId(id);
      return (employeeService.updateEmployee(employee, id));
    }
    
    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) {
		return (employeeService.deleteEmployee(id));
    
    }
    
    @GetMapping("/employee")
    public List<Employee> findAll(){
		return (employeeService.findAll());
    }
    
    @GetMapping("/employee/{id}")
    public Employee find(@PathVariable Integer id) {
		return (employeeService.find(id));
    	
    }
   
    	
    	
    
    
}
