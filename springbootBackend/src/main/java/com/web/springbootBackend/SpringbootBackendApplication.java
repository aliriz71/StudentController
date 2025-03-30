package com.web.springbootBackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.web.springbootBackend.repository.StudentRepo;

@SpringBootApplication
public class SpringbootBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
		
	
	}	
	
	
/*	@Autowired
	private StudentRepo studentRepo;
		
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = Student.builder()
				.studentName("John")
				.studentEmail("John@gmail.com")
				.year(2)
				.build();
		
		Student student2 = Student.builder()
				.studentName("Johnny")
				.studentEmail("Johnny@gmail.com")
				.year(3)
				.build();
			
		studentRepo.save(student1);
		studentRepo.save(student2);

	}
	*/
}
