package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.demo.entity.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private DynamoDBMapper dbmapper;
	
	public Employee saveEmployee(Employee employee)
	{
		dbmapper.save(employee);
		return employee;
	}
	
}
