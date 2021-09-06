package com.techment.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Entity.Employee;
import com.techment.Service.IEmployeeService;

@RestController
@RequestMapping(value="/empController")
public class EmployeeControllerWithDb {

	@Autowired
	IEmployeeService iEmployeeService;
	
	@GetMapping(value="/viewAllEmployee")
	public List<Employee> viewAllEmployee()
	{
		return iEmployeeService.viewAllEmployee();
	}
	
	@PostMapping(value="/addNewEmployee")
	public String addNewEmployee(@RequestBody Employee employee)
	{
		return iEmployeeService.addEmployee(employee);
	}
	
	@GetMapping(value="/viewEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return iEmployeeService.viewEmployeeById(id);
	}
	
}
