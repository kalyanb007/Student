package com.example.demo.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Student.StudentDetails;
import com.example.demo.StudentRespository.RepoStudent;

@Service
public  class Studentserivce {
    @Autowired
	RepoStudent respository;
	
	public String addStudent(StudentDetails student)
	{
		respository.save(student);
		return "add";
	}
	public List<StudentDetails> getStudent()
	{
		return respository.findAll();
	}
	public  Optional<StudentDetails> getStudentById(int id)
	{
		return respository.findById(id);
	}

}