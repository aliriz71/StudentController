package com.web.springbootBackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.web.springbootBackend.entity.Student;

// This interface extends JpaRepository which provides basic CRUD operations
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	Student findByStudentNum(int studentNum);

}
