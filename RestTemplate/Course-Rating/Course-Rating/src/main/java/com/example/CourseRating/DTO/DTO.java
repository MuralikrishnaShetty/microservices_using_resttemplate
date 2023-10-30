package com.example.CourseRating.DTO;

import jakarta.persistence.Id;

public class DTO {
	private Integer rating;
	private String comment;
	private Integer courseId;

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public DTO(Integer rating, String comment, Integer courseId) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.courseId = courseId;
	}

	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
