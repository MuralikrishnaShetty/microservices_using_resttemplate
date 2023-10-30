package com.example.CourseRating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseRating.DTO.DTO;
import com.example.CourseRating.entity.CourseRating;
import com.example.CourseRating.repo.CourseRatingRepo;

@Service
public class CourseRatingService {
	@Autowired
	CourseRatingRepo repo;
	
	public DTO getById(Integer courseId) {
		CourseRating rr=repo.getById(courseId);
		DTO dto=new DTO();
		dto.setRating(rr.getRating());
		dto.setCourseId(rr.getCourseId());
		dto.setComment(rr.getComment());
		return dto;
	}

}
