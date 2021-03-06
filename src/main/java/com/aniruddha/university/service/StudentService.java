package com.aniruddha.university.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniruddha.university.dao.StudentRepo;
import com.aniruddha.university.entity.Student;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	public void save(Student student) {
		repo.save(student);
	}
	
	public Student get(Integer rollNo) {
        return repo.findById(rollNo).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
