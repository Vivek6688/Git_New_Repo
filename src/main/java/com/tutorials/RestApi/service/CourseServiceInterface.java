package com.tutorials.RestApi.service;

import java.util.List;
import java.util.Optional;

import com.tutorials.RestApi.Entity.Course;

public interface CourseServiceInterface {
	
	public List<Course> getCourses();
	
	public Optional<Course> getCourse(long courseID);
	

}
