package com.tutorials.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorials.RestApi.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
