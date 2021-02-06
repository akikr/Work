package com.dell.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dell.demo.model.Student;
import com.dell.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

//	@Resource
  @Autowired
    private StudentService studentService;
    
    @RequestMapping()
    public String apiWelcome() {
    	return "Welcome to Student API !!";
    }

//  @RequestMapping(value = "/student", method = RequestMethod.GET)
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

//  @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentId(id);
    }
    
//  @RequestMapping(value = "/student", method = RequestMethod.POST)
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
    	studentService.addStudent(student);
    	return "Student Added";
    }
    
//  @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    @PutMapping("/student/{id}")
    public String updateStudent(@PathVariable String id, @RequestBody Student student) {
    	studentService.updateStudent(id, student);
    	return "Student id: " + id + " updated";
    }
    
//  @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable String id) {
    	studentService.deleteStudent(id);
    	return "Student id: " + id + " deleted !!";
    }
}
