package com.tutorials.RestApi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int courseID;
	
	private String courseName;
	
	private String Description;

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Course(int courseID, String courseName, String description) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		Description = description;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", Description=" + Description + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
