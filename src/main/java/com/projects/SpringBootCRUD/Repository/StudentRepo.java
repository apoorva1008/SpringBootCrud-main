package com.projects.SpringBootCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.SpringBootCRUD.Module.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
