package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Courses;
@Service
public class CourseServiceImpl implements CourseService {
List <Courses> list;

public CourseServiceImpl() {
	list= new ArrayList<>();
	list.add(new Courses(145, "java", "java basics"));
	list.add(new Courses(122, "html", "basics html"));
}
	@Override
	public List<Courses> getCourses() {
	
		
		return list;
	}
	@Override
	public Courses getCourse(long courseId) {
		Courses c=null;
		for(Courses cour: list) {
			if(cour.getId()==courseId) {
				c=cour;
				break;
			}
		}
		return c;
	}
	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	
	
}
