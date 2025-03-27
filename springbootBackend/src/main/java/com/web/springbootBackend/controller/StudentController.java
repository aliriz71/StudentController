package com.web.springbootBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.springbootBackend.entity.Student;
import com.web.springbootBackend.repository.StudentRepo;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081/")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/students")
	public List<Student> fetchStudents() {
		return studentRepo.findAll();
	}
	
	@PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }
}

