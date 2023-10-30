package com.example.Enrolledcourses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Enrolledcourses.entity.EnrolledCourse;
import com.example.Enrolledcourses.repo.EnrolledCourseRepo;

@Service
public class EnrolledCourseServices {
	@Autowired
	EnrolledCourseRepo repo;

	public List<Integer> getCourseIdsByUserId(Integer userId) {
		List<Integer> listOfCourse = repo.getCourseIdsByUserId(userId);
		return listOfCourse;

	}

}
