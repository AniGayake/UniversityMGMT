package com.aniruddha.university.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.university.entity.Student;
import com.aniruddha.university.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public List<Student> list(){
		return service.listAll();
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		service.save(student);
		return student;
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Integer rollNo){
		try {
			Student existStudent = service.get(rollNo);
			service.save(student);
			return new ResponseEntity<> (HttpStatus.OK);
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
