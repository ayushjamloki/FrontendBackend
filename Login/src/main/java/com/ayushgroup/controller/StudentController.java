package com.ayushgroup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayushgroup.entities.Student;
import com.ayushgroup.repo.studentRepository;
import com.ayushgroup.service.StudentService;

@CrossOrigin(origins="http://localhost:3000")
@RestController

@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService stuservice;
	
	
	
	@PostMapping("/addStudent")
	public String addStudent (@RequestBody Student student){
		stuservice.saveStudent(student);
		return "New Student is added Sucessfully";
		
	}
	@GetMapping("/get")
	public List<Student> getAll(){
		return stuservice.getAll();
		
	}
    @Autowired
    private studentRepository stdn;
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        return stdn.findById(id).map(student -> {
            stdn.delete(student);
            return ResponseEntity.ok("Student deleted successfully");
        }).orElse(ResponseEntity.notFound().build());
    }

}
