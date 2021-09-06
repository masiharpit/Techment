package com.springboot.RestfulAPI.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.RestfulAPI.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
