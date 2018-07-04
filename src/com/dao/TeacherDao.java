package com.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.entity.Teacher;



public class TeacherDao extends GenericDao<Teacher>{
	//登陆时查找老师
	public Teacher find(int idNumber, String password) {
		String jpql = "FROM Teacher t WHERE t.idNumber = :idNumber AND t.password = :password";
		Query query = getEntityManager().createQuery(jpql);
		query.setParameter("idNumber", idNumber);
		query.setParameter("password", password);
		Teacher teacher = null;
		try {
			teacher = (Teacher)query.getSingleResult();
		}catch (NoResultException e) {
			// TODO: handle exception
		}
		return teacher;
	}
	//修改个人信息
	public void updateInfo(Teacher teacher) {
		merge(teacher);
	}
	//修改密码
	public void updatePassword(int idNumber,String password) {
		String jpql = "UPDATE Teacher t SET t.password = :password WHERE t.idNumber = :idNumber";
		Query query = getEntityManager().createQuery(jpql);
		query.setParameter("idNumber", idNumber);
		query.setParameter("password", password);
		query.executeUpdate();
	}
}
