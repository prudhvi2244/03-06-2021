package com.example.demo.controller;

import java.lang.management.BufferPoolMXBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository erepository;

	/*
	 * http://localhost:8080/employee/saveEmployee
	 */
	@PostMapping(value = "/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		erepository.saveEmployee(emp);
		return emp;
	}

}
