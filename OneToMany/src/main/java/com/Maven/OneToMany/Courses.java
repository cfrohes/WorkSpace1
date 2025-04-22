package com.Maven.OneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@ManyToOne
	@JoinColumn(name = "s_id")
	Student student;
	
	public Courses() {
		super();
	}
	
	
	public Courses(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}


	public Courses(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", s_id=" + student + "]";
	}


	
	
	
	

}
