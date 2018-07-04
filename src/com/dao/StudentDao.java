package com.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.entity.Student;


public class StudentDao extends GenericDao<Student>{
	//登陆时查找学生
	public Student find(int idNumber, String password) {
		String jpql = "FROM Student s WHERE s.idNumber = :idNumber AND s.password = :password";
		Query query = getEntityManager().createQuery(jpql);
		query.setParameter("idNumber", idNumber);
		query.setParameter("password", password);
		Student student = null;
		try {
			student = (Student)query.getSingleResult();
		}catch (NoResultException e) {
			// TODO: handle exception
		}
		return student;
	}
	//修改个人信息
	public void updateInfo(Student student) {
		merge(student);
	}
	//修改密码
	public void updatePassword(int idNumber,String password) {
		String jpql = "UPDATE Student s SET s.password = :password WHERE s.idNumber = :idNumber";
		Query query = getEntityManager().createQuery(jpql);
		query.setParameter("idNumber", idNumber);
		query.setParameter("password", password);
		query.executeUpdate();
	}
	
}
