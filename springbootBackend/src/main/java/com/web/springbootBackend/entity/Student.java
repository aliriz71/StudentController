package com.web.springbootBackend.entity;

import jakarta.persistence.*;
import lombok.*;

/*
 * This class is used to create a Student entity
 * studentNum      integer not null, 
   studentName     varchar(30) not null, 
   studentEmail       varchar(75) not null unique,
   year      integer not null,  
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
@Builder
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentNum;
	
	@Column(name = "studentName", nullable = false)
	private String studentName;
	
	@Column(name = "studentEmail", nullable = false, unique = true)
	private String studentEmail;
	
	@Column(name = "year", nullable = false)
	private int year;
}
