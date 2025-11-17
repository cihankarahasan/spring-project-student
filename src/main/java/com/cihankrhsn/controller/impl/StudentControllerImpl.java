package com.cihankrhsn.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cihankrhsn.controller.IStudentController;
import com.cihankrhsn.entities.Student;
import com.cihankrhsn.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	@Autowired
	private IStudentService studentService;

	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);
	}

}
