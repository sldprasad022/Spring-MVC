package com.girus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girus.entity.Employee;
import com.girus.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmp(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public Employee getById(Long id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> all()
	{
		return employeeRepository.findAll();
	}
	
	public String deleteById(Long id)
	{
		if (employeeRepository.existsById(id)) 
		{
			employeeRepository.deleteById(id);
			return "record deleted";
		}
		else 
		{
			return "record is not present";
		}
	}
}
