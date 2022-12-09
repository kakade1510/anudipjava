package com.hibertest.HiberTest.StudentDao;

import com.hibertest.HiberTest.entities.Student;

public interface StudentDao {
	public int insertStudent(Student st);
	public Student getStudent(int id);
    boolean deleteStudent(int id);
    boolean updateStudent(int id);
	

}
