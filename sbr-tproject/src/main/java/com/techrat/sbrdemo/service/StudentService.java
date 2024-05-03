package com.techrat.sbrdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techrat.sbrdemo.exception.StudentAlreadyExistsException;
import com.techrat.sbrdemo.model.Student;
import com.techrat.sbrdemo.repository.StudentRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

	private final StudentRepository studentRepository = null;
	@Override
	public Student addStudent(Student student) {
		if(studentAlreadyExists(student.getEmail())) {
			throw new StudentAlreadyExistsException(student.getEmail() + " already exists!");
		}
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		
	}

	public boolean studentAlreadyExists(String email) {
		return studentRepository.findByEmail(email).isPresent();
	}
}
