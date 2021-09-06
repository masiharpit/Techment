package com.techment.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Entity.Course1;
import com.techment.Service.CourseServiceImpl;

@RestController
@RequestMapping(value="/courseController")
public class CourseController {

	@Autowired
	private CourseServiceImpl service;
	
	@GetMapping("/courses")
	public List<Course1> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<Course1> get(@PathVariable int id)
	{
		try
		{
			Course1 course = service.get(id);
			return new ResponseEntity<Course1>(course, HttpStatus.OK);
		}catch(NoSuchElementException e)
		{
			return new ResponseEntity<Course1>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Course1 course)
	{
		service.save(course);
	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody Course1 course, @PathVariable int id)
	{
	
		try
		{
			Course1 c =  service.get(id);
			service.save(course);
			return "Course Updated";
		}catch(NoSuchElementException e)
		{
			return "Not a valid CourseId.";
		}
	}
}
