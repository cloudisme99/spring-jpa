package com.example.springdatajpaexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.service.StudentService;

//@Controller		return 값을 "hello" -> view로 리턴
@RestController		// return 값을 json 값으로 변경
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/student")
	public List<Students> getAllStudents() {
		return studentService.selectAllStudents();
	}

	@GetMapping("/student/name")
	public List<Students> getAllStudentsName() {
		return studentService.selectAllByName();
	}
}
