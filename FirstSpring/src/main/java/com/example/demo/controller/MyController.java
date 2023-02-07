package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Courses;
import com.example.demo.service.CourseService;

@RestController
public class MyController {
    @Autowired
	public CourseService courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	
	
	@GetMapping("/courses")
	public List<Courses> getCourse(){
		return this.courseservice.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCours(@PathVariable long courseId) {
		return this.courseservice.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseservice.addCourse(course);
	}
	
}
