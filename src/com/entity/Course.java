package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String course_name;
	private CourseAddress courseAddress;
	private CourseTime courseTime; 
	@ManyToOne
	private Teacher teacher;
	@ManyToOne
	private Student student;
	public int getId() {
		return id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public CourseAddress getCourseAddress() {
		return courseAddress;
	}
	public CourseTime getCourseTime() {
		return courseTime;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public void setCourseAddress(CourseAddress courseAddress) {
		this.courseAddress = courseAddress;
	}
	public void setCourseTime(CourseTime courseTime) {
		this.courseTime = courseTime;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
