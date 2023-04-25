package com.example.demo.StudentController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.StudentDetails;
import com.example.demo.StudentService.Studentserivce;

@RestController
@RequestMapping("/abc")
public class Controller {
	@Autowired
	 Studentserivce obj;
	
	@PostMapping("")
	public String create(@RequestBody StudentDetails student)
	{
		return obj.addStudent(student);
	}
	@GetMapping("")
	public List<StudentDetails> read()
	{
		return obj.getStudent();
	}
	@GetMapping("/{id}")
	public Optional<StudentDetails>readById(@PathVariable int id)
	{
		return obj.getStudentById(id);
	}
	
	
	

}