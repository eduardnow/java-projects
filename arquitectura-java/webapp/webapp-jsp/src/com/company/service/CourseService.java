package com.company.service;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Course;

public class CourseService {

	public List<Course> all() {
		Course c1 = new Course("java", 1);
		Course c2 = new Course("net", 1);
		Course c3 = new Course("php", 2);

		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

		return courses;
	}
}
