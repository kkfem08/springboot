package com.test.learnspringframework.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.learnspringframework.entities.Courses;

@Service
public class courseserviceImpl implements courseService {
 
	List<Courses> list;
	
	public courseserviceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(101,"Core JAVA","This course contains basic of java"));
		list.add(new Courses(102,"Jmeter","This course contains basic of jmeter"));
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourses(long courseId) {
		Courses c= null;
		for(Courses course:list)
		{
			if(course.getId()==courseId) {
				
				c=course;
				break;
			}
		}
		return c;
	}

	

}
