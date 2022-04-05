package com.aniruddha.university.entity;

public class Teacher {
	public String name;
	public String dept;
	public float experience;
	
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
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public Teacher(String name, String dept, float experience) {
		super();
		this.name = name;
		this.dept = dept;
		this.experience = experience;
	}
	
	

}
