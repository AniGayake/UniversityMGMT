package com.aniruddha.university.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public int rollNo;
	public String name;
	public String dept;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(int rollNo, String name, String dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}
	
	
}
