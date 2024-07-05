package com.example.springdatajpaexample.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "member")
public class Member {
	@Id
	@Column
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private Integer age;

	// Enumerated 어노테이션 추가
	@Enumerated(EnumType.STRING)
	private RoleType roleType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
}