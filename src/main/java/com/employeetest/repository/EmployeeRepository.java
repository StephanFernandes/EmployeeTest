package com.employeetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeetest.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
