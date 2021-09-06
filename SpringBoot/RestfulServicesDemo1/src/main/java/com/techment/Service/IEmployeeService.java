package com.techment.Service;

import java.util.List;

import com.techment.Entity.Employee;

public interface IEmployeeService {

	String addEmployee(Employee employee);
	List<Employee> viewAllEmployee();
	Employee viewEmployeeById(int id);
}
