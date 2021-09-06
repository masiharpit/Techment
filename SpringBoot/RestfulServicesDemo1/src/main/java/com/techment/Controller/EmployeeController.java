package com.techment.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	public EmployeeController()
	{
		employees.add(new Employee(1, "Brad", "Analyst"));
		employees.add(new Employee(2, "Dan", "Associate"));
	}
	@GetMapping(value="/showMessage")
	public String display()
	{
		return("this is my sprig mvc application");
	}
	
	@GetMapping(value="/showAllEmployees")
	public ArrayList<Employee> showEmployees()
	{
		return employees;
	}
	
//	@RequestMapping(method= RequestMethod.POST)
	@PostMapping(value="/addEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		employees.add(employee);
		return "Employee added.";
	}

}
