package com.test.learnspringframework.services;

import java.util.List;

import com.test.learnspringframework.entities.Courses;

public interface courseService {

	public List<Courses> getCourses();
	
	public Courses getCourses(long courseId);
	
	
}
