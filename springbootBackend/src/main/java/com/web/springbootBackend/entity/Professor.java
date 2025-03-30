package com.web.springbootBackend.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "professor")
@Builder
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profNum;
	
	@Column(name = "profFirstName", nullable = false)
	private String profFirstName;
	
	@Column(name = "profLastName", nullable = false)
	private String profLastName;
	
	@Column(name = "office")
	private String office;
	
	@Column(name = "dept", nullable = false)
	private String dept;
	
	@Column(name = "profName", nullable = false, unique = true)
	private String profEmail;
	

}

