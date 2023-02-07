package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Courses;

public interface CourseService {


	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourse(Courses course);
	
}
