package com.web.springbootBackend.entity;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table (name = "course")
/*
 * Ex;
 * courseNum EECS2101
 * courseName Data structures and algorithms
 * 
 * Courses need classes to be taught
 */
public class Course {
	@Id
	@Column(name = "courseNum", nullable = false)
	private String courseNum;
	@Column(name = "courseName", nullable = false)
	private String courseName;

}
