package com.example.demo.StudentRespository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Student.StudentDetails;

public interface RepoStudent extends JpaRepository<StudentDetails ,Integer>{

}