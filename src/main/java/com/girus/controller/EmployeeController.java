package com.girus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.girus.entity.Employee;
import com.girus.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		Employee savedEmp = employeeService.saveEmp(employee);
		return new ResponseEntity<Employee>(savedEmp,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/fetchById/{id}")
	public ResponseEntity<Employee> getById(@PathVariable("id") Long id)
	{
		Employee getId = employeeService.getById(id);
		return new ResponseEntity<Employee>(getId,HttpStatus.OK);
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Employee>> allEmp()
	{
		List<Employee> allEmployees = employeeService.all();
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
	
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee)
	{
		Employee updateEmp = 
	}

	
	
	
	
}
