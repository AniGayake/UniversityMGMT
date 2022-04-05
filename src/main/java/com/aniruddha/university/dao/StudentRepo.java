package com.aniruddha.university.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.university.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
