package com.techment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.Entity.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer>{

}
