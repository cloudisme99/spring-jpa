package com.example.springdatajpaexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpaexample.domain.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {

	List<Students> findByName(String name);

}
