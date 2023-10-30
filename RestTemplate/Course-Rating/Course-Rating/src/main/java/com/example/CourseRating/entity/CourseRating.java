package com.example.CourseRating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseRating {
	
	public Integer rating;
	public String comment;
	@Id
	public Integer courseId;
	
	
	public CourseRating(Integer rating, String comment, Integer courseId) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.courseId = courseId;
	}
	public CourseRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
