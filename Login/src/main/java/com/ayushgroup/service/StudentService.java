package com.ayushgroup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ayushgroup.entities.Student;

@Service
public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAll();
	public void deleteStudent(int id);
}
