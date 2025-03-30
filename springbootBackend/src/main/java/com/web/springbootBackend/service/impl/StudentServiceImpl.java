package com.web.springbootBackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.springbootBackend.entity.Student;
import com.web.springbootBackend.repository.StudentRepo;
import com.web.springbootBackend.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		return studentRepo.findById(id);	//returns an Optional<Student> object
	}

}