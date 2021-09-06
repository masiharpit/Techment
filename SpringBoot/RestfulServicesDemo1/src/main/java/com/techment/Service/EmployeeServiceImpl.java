package com.techment.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Dao.IEmployeeDao;
import com.techment.Entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeDao employeeDao;
	
	@Override
	public String addEmployee(Employee employee)
	{
		employeeDao.save(employee);
		return "Employee added.";
	}
	
	@Override
	public List<Employee> viewAllEmployee()
	{
		return employeeDao.findAll();
	}

	@Override
	public Employee viewEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
