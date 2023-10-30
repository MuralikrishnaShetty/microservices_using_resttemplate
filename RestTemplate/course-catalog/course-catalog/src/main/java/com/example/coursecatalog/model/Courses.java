package com.example.coursecatalog.model;

public class Courses {
	Integer courseId;
	Integer rating;
	String coomment;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getCoomment() {
		return coomment;
	}
	public void setCoomment(String coomment) {
		this.coomment = coomment;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", rating=" + rating + ", coomment=" + coomment + "]";
	}
	
	
	
}
