package com.techrat.sbrdemo.service;

import java.util.List;

import com.techrat.sbrdemo.model.Student;
import com.techrat.sbrdemo.repository.StudentRepository;

public interface IStudentService {

	Student addStudent(Student student);
	
	List<Student> getStudents();
	
	Student updateStudent(Student student, Long id);
	
	Student getStudentById(Long id);
	
	void deleteStudent(Long id);
}
