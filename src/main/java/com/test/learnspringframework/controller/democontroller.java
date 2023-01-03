package com.test.learnspringframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.learnspringframework.entities.Courses;
import com.test.learnspringframework.services.courseService;

@RestController

public class democontroller {
	@Autowired 
	private courseService courseservice;
	
	
	 @GetMapping("/home")
	    @ResponseBody
	 
	    // Method
	    public String home()
	    {
	 
	        // Print statement
	        return "This is home page";
	    }
	 @GetMapping("/courses")
	 	public List<Courses> getCourses()
	 {
	 		
		 return this.courseservice.getCourses();
		 
	 	}
	 @GetMapping("/courses/{courseId}")
	 public Courses getCourses(@PathVariable String courseId) {
		 return this.courseservice.getCourses(Long.parseLong(courseId));
	 }
	
}
