package com.Mavan.HibernateExists;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
@Id
int id;
@Column
int pwd;
@Column
String name;
@Column
int age;

public Student(int id, int pwd, String name, int age) {
	super();
	this.id = id;
	this.pwd = pwd;
	this.name = name;
	this.age = age;
}

public Student() {
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPwd() {
	return pwd;
}

public void setPwd(int pwd) {
	this.pwd = pwd;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + "]";
}



}
