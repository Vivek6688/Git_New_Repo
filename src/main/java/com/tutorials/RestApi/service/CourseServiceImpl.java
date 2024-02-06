package com.tutorials.RestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.RestApi.Entity.Course;
import com.tutorials.RestApi.Repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseServiceInterface {

	@Autowired
	private CourseRepository repository;

	@Override
	public List<Course> getCourses() {
		List<Course> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public Optional<Course> getCourse(long courseID) {
		Optional<Course> findById = repository.findById((int) courseID);
		return findById;
	}

	 
	
}
