package com.techment.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Dao.ICourse;
import com.techment.Entity.Course1;

@Service
public class CourseServiceImpl {

	@Autowired
	ICourse iCourse;
	
	public List<Course1> listAll()
	{
		return iCourse.findAll();
	}
	
	public void save(Course1 course)
	{
		iCourse.save(course);
	}
	
	public Course1 get(int id)
	{
		return iCourse.getById(id);
	}
	
	public void delete(Integer id)
	{
		iCourse.deleteById(id);
	}
	
}
