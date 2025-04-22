package com.Maven.OneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	int marks;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addr_id", referencedColumnName="id")
	address addr_id;
	
	public student(String name, int marks, address addr_id) {
		super();
		this.name = name;
		this.marks = marks;
		this.addr_id = addr_id;
	}
	
	public student() {
		
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public address getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(address addr_id) {
		this.addr_id = addr_id;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", addr_id=" + addr_id + "]";
	}
	
	

}
