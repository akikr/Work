package com.dell.demo.service;

import com.dell.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("101", "Demo1", "Course1","demo1@mail.com"),
            new Student("102", "Demo2", "Course2","demo2@mail.com"),
            new Student("103", "Demo3", "Course3","demo3@mail.com"),
            new Student("104", "Demo4", "Course4","demo4@mail.com")
    ));

    public List<Student> getStudents(){
        return students;
    }

    public Student getStudentId(String id){
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(String id, Student student) {
		for( int i = 0; i < students.size(); i++) {
			if(students.get(i).getId().equals(id)) {
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(String id) {
		students.removeIf(s -> s.getId().equals(id));
	}
}
