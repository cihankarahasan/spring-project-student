package com.cihankrhsn.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cihankrhsn.entities.Student;
import com.cihankrhsn.repository.StudentRepository;
import com.cihankrhsn.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
		
	}

}
