package com.dell.demo.model;

public class Student {
	
    private String id;
    private String name;
    private String course;
    private String email;

    public Student() {
    }
    
    public Student(String id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
}
