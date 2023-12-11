package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Simple introductory Rest API to understand Spring Boot 
@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","Udit's Academy"),
				new Course(2,"Learn DevOps","Udit's Academy"),
				new Course(2,"Learn Azure","Udit's Academy")
				);
		
	}
}
