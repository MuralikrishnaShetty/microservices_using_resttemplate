package com.example.Enrolledcourses.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Enrolledcourses.entity.EnrolledCourse;

public interface EnrolledCourseRepo extends JpaRepository<EnrolledCourse,Integer> {
	 @Query("SELECT ec.courseId FROM EnrolledCourse ec WHERE ec.userId = :userId")
	List<Integer> getCourseIdsByUserId(@Param("userId")Integer userId);

}
