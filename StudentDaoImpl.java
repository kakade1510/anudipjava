package com.hibertest.HiberTest.StudentDaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibertest.HiberTest.StudentDao.StudentDao;
import com.hibertest.HiberTest.entities.Student;

import SessionProvider.HiberUtil;

public class StudentDaoImpl implements StudentDao {
	
	Session session = HiberUtil.getSession();

	public boolean insertBook(Student st) {
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		return true;
	}

	public Student getStudent11(int id) {

		return session.get(Student.class, id);
	}

	public boolean updateStudent(int id, String sname) {
		Transaction tx = session.beginTransaction();
		Student s = session.get(Student.class, id);
		s.setSname(sname);
		session.update(s);
		tx.commit();
		session.close();
		return true;
	}

	public boolean deleteStudent(int id) {
		Transaction tx = session.beginTransaction();
		Student st = session.get(Student.class, id);
		session.delete(st);
		tx.commit();
		session.close();
		return true;
	}

	

	public Student getStudent(int id) {
		return null;
	}
	

	public int insertStudent(Student st) {
		return 0;
	}


	public boolean updateStudent(int id) {
		return false;
	}
	

	public int deleteStudent1(int id) {
		return 0;
	}


	

}





