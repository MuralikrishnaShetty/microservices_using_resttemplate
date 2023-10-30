package com.example.Enrolledcourses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Enrolledcourses.entity.EnrolledCourse;
import com.example.Enrolledcourses.service.EnrolledCourseServices;

@RestController
@RequestMapping("/enrolledCourse")
public class EnrolledCourseController {
	@Autowired
	EnrolledCourseServices eser;

	@GetMapping("/{userId}")
	public ResponseEntity<List<Integer>> getCourseIdsByUserId(@PathVariable Integer userId) {
		List<Integer> li = eser.getCourseIdsByUserId(userId);

		return new ResponseEntity<>(li, HttpStatus.OK);

	}

}
