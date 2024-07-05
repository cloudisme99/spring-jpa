package com.example.springdatajpaexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Students> selectAllStudents() {
		return studentRepository.findAll();
	}

	public List<Students> selectAllByName() {
		return studentRepository.findByName("이름");
	}

	public Students insertStudent(Students student) {
		return studentRepository.save(student);
	}


}
