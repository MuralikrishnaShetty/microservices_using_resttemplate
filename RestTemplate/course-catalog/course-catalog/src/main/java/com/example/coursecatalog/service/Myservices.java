package com.example.coursecatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.coursecatalog.model.Catalog;
import com.example.coursecatalog.model.Courses;
import com.example.coursecatalog.model.User;
import com.example.coursecatalog.repo.CatalogRepo;

@Service
public class Myservices {

	@Autowired
	CatalogRepo repo;

	@Autowired
	RestTemplate resttemplate;

	public List<Catalog> getUserByid(Integer userId) {
		// Courses cour
		// =resttemplate.getForObject("http://localhost:9090/courseRating/"+courseId,
		// Courses.class);
		// Integer
		// courseId=resttemplate.getForObject("http://localhost:9091/enrolledCourse/"+userId,User.class).getCourseId();
		// Catalog
		// catalog=resttemplate.getForObject("http://localhost:9090/courseRating/"+courseId,Catalog.class);
		// return catalog;
		List<Catalog> listOfCatalog = new ArrayList<Catalog>();
		List<Integer> courseId = resttemplate.getForObject("http://localhost:9091/enrolledCourse/" + userId,
				List.class);
		
		System.out.println(courseId);//101,102
		for (int i = 0; i < courseId.size(); i++) {
			System.out.println("Course_id"+courseId.get(i));//debug  (-1)
			
			Catalog catalog = resttemplate.getForObject("http://localhost:9090/courseRating/" + courseId.get(i),
					Catalog.class);
			System.out.println("Catalog"+catalog);//debug
			listOfCatalog.add(catalog);
		}
		return listOfCatalog;

	}

}
