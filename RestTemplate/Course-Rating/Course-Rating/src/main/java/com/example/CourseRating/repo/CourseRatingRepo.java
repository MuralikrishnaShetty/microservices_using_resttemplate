package com.example.CourseRating.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseRating.entity.CourseRating;

public interface CourseRatingRepo extends JpaRepository<CourseRating,Integer> {

}
