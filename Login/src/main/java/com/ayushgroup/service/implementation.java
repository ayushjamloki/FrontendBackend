package com.ayushgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayushgroup.entities.Student;
import com.ayushgroup.repo.studentRepository;

@Service
public class implementation implements StudentService {
	
	@Autowired
	private studentRepository strp;

	@Override
	public Student saveStudent(Student student) {
	
		return strp.save(student);
	}

	@Override
	public List<Student> getAll() {

		return strp.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		strp.deleteById(id);
	
	}

}
