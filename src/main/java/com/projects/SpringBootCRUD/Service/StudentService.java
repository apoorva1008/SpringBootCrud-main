package com.projects.SpringBootCRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.SpringBootCRUD.Module.Student;
import com.projects.SpringBootCRUD.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	public StudentRepo studentRepo;
	
	public List<Student> getAll() {
		return studentRepo.findAll();
	}

	public void add(Student s) {
		studentRepo.save(s);
	}

	public Student getById(Long id) {
		
		return studentRepo.findById(id).get();
	}

	public void update(Long id, Student s) {
		Student s1 = studentRepo.findById(id).get();
		s1.setFname(s.getFname());
		s1.setLname(s.getLname());
		studentRepo.save(s);
		
	}

	public void delete(Long id) {
		studentRepo.deleteById(id);
		
	}

	

}
