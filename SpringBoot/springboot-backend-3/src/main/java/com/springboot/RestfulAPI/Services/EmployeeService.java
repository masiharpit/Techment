package com.springboot.RestfulAPI.Services;

import java.util.List;

import com.springboot.RestfulAPI.Model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmpoyee(Employee employee, long id);
	void deleteEmployee(long id);
}
