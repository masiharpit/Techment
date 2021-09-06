package com.springboot.firstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Ramesh", "Barodia");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ramesh", "Barodia"));
		students.add(new Student("Suresh", "Jhangade"));
		students.add(new Student("Mahesh", "Dhandle"));
		students.add(new Student("Mukesh", "Bhalla"));
		
		return students;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName)
	{
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryparam(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName") String lastName)
	{
		return new Student(firstName, lastName);
	}
}
