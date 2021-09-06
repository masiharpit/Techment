package com.techment.Service;

import java.util.List;


import com.techment.Entity.Course1;

public interface ICourseService {

	public List<Course1> listAll();
	
	public void save(Course1 course);
	
	public Course1 get(int id);
	
	public void delete(Integer id);
}
