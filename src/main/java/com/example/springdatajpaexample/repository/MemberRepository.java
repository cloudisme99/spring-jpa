package com.example.springdatajpaexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpaexample.domain.Member;
import com.example.springdatajpaexample.domain.Students;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

	//List<Students> findByName(String name);

}
