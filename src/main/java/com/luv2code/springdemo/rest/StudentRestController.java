package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> theStudents = new ArrayList<Student>();
	
	@PostConstruct
	public void loadData() {
		theStudents.add(new Student("Adams", "Shurley", "adams@gmail.com"));
		theStudents.add(new Student("Sherif", "Adavuruku", "sherif@gmail.com"));
		theStudents.add(new Student("Marvel", "Biden", "biden@yahoo.com"));
		theStudents.add(new Student("Kamara", "Johnny", "johnny@gmail.com"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudent() {
		return theStudents;
	}
	
	@GetMapping("/students/{studentsId}")
	public Student getStudent(@PathVariable("studentsId") final int studentId) {
		// check the studentId against list size
		if ( (studentId >= theStudents.size()) || (studentId < 0) ) {			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		return theStudents.get(studentId);
	}
	
	
	 
	 
}
