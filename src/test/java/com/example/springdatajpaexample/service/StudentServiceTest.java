package com.example.springdatajpaexample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpaexample.domain.Students;

@SpringBootTest
class StudentServiceTest {
	@Autowired
	private StudentService studentService;

	@Test
	public void insertTest() {
		Students student = new Students("왕", 20, "서울");
		studentService.insertStudent(student);
	}
}