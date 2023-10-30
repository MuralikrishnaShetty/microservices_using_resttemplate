package com.example.Enrolledcourses.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EnrolledCourse {
	@Id
	Integer courseId;
	
	Integer userId;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getUserId() {
		return userId;
	}

	public EnrolledCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnrolledCourse(Integer courseId, Integer userId) {
		super();
		this.courseId = courseId;
		this.userId = userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "EnrolledCourse [courseId=" + courseId + ", userId=" + userId + "]";
	}

}
