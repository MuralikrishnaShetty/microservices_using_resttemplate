package com.example.coursecatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursecatalog.model.Catalog;
import com.example.coursecatalog.model.User;
import com.example.coursecatalog.service.Myservices;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	@Autowired
	Myservices service;

	@GetMapping("/{userId}")
	ResponseEntity<List<Catalog>> getUserByid(@PathVariable Integer userId) {
//		Courses cour =resttemplate.getForObject("http://localhost:9090/courseRating/"+courseId, Courses.class);
		List<Catalog> catalog= service.getUserByid(userId);
		return new ResponseEntity<>(catalog,HttpStatus.OK);
	}

}
