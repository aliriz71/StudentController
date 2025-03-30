package com.web.springbootBackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.springbootBackend.entity.Student;
import com.web.springbootBackend.repository.StudentRepo;
import com.web.springbootBackend.service.StudentService;

@RestController	//to expose the API
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	//GET request to fetch all students
	@GetMapping("/students")
	public List<Student> fetchStudents() {
	    return studentService.getAllStudents();
	}
	//GET request to fetch a student by their unique id
	@GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Optional<Student> student = studentService.getStudentById(id);
        
        if (student.isPresent()) {
			return ResponseEntity.ok(student.get()); 	//returns 200 OK with the student object
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)  //returns 404 Not Found
                    .body(null);  
		}
    }
	
	//POST request to create a new student
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
	    return studentService.createStudent(student);
	}
}

