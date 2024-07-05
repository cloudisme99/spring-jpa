package com.example.springdatajpaexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.MemberRepository;
import com.example.springdatajpaexample.repository.StudentRepository;

@Service
public class MemberService {
	private final MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
}
