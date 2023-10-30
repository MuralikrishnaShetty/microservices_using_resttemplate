package com.example.coursecatalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Catalog {
	@Id
	Integer courseId;
	Integer rating;
	String comment;
//	Integer userId;

	@Override
	public String toString() {
		return "Catalog [courseId=" + courseId + ", rating=" + rating + ", comment=" + comment 
				+ "]";
	}

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

	public String getcomment() {
		return comment;
	}

	public void setCoomment(String coomment) {
		this.comment =comment;
	}

//	public Integer getUserId() {
//		return userId;
//	}

//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}

}
