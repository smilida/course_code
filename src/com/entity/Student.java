package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private int idNumber;      //学号
	@Column(nullable = false)
	private String password;
	private String name;       //姓名
	private String sex;        //性别
	private String grade;      //班级
	@OneToMany(mappedBy = "student")
	private Set<Course> courses;
	public int getId() {
		return id;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public String getGrade() {
		return grade;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
