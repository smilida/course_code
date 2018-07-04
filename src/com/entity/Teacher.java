package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private int idNumber;      //教工号
	@Column(nullable = false)
	private String password;
	private String name;       //姓名
	private String title;
	private int phoneNumber;
	@OneToMany(mappedBy = "teacher")
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
	public String getTitle() {
		return title;
	}
	public int getPhoneNumber() {
		return phoneNumber;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
