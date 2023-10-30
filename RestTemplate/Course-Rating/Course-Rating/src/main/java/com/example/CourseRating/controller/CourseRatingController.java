package com.example.CourseRating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseRating.DTO.DTO;
import com.example.CourseRating.entity.CourseRating;
import com.example.CourseRating.service.CourseRatingService;

@RestController
@RequestMapping("/courseRating")
public class CourseRatingController {
	@Autowired
	CourseRatingService service;

	@GetMapping("/{courseId}")
	public ResponseEntity<DTO> getById(@PathVariable Integer courseId) {
		DTO rating=service.getById(courseId);
		return new ResponseEntity<>(rating,HttpStatus.OK);
		

	}

}
