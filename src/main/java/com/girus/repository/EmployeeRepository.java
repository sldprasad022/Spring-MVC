package com.girus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.girus.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
