package com.springboot.RestfulAPI.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.RestfulAPI.Model.Employee;
import com.springboot.RestfulAPI.Services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService)
	{
		super();
		this.employeeService = employeeService;
	}
	
	//Build Create Employee Rest API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//Build GET all employees Rest API
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees(); 
	}
	
	//Build Get Employee Rest API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
	//Update Employee Rest API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.updateEmpoyee(employee, id), HttpStatus.OK);
	}
	
	//Build delete employee RestAPI
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
	{
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted succesfully.!", HttpStatus.OK);
	}
}
