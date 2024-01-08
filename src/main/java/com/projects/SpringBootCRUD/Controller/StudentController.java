package com.projects.SpringBootCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.SpringBootCRUD.Module.Student;
import com.projects.SpringBootCRUD.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getAll() {
		return studentService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Student getById(@PathVariable Long id) {
		return studentService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Student s) {
		studentService.add(s);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Long id,@RequestBody Student s) {
		 studentService.update(id,s);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		studentService.delete(id);
	}
	
	

}
