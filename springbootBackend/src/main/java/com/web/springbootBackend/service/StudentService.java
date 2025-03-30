package com.web.springbootBackend.service;

import java.util.List;
import java.util.Optional;

import com.web.springbootBackend.entity.Student;

//Service layer is used to implement business logic. It is used to separate the business logic and the presentation logic.
public interface StudentService {
    List<Student> getAllStudents();	//request students from front-end at /students
    Student createStudent(Student student);	//create a new student
    Optional<Student> getStudentById(int id);	//get student by id
}