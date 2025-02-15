package com.ayushgroup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayushgroup.entities.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

}
