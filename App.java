package com.hibertest.HiberTest;

import java.util.Scanner;

import com.hibertest.HiberTest.StudentDao.StudentDao;
import com.hibertest.HiberTest.StudentDaoImpl.StudentDaoImpl;
import com.hibertest.HiberTest.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        displayMenu();

	}

	private static void displayMenu() {

		StudentDao sdao = new StudentDaoImpl();
		System.out.println("Press 1. To Create Student :");
		System.out.println("Press 2. To Retrieve Student :");
		System.out.println("Press 3. To Update Student :");
		System.out.println("Press 4. To Delete Student :");
		System.out.println("Press 9. To Exit :");
		int id;
		Student st;
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch (ch) {
		case 1:
			st = new Student();
		    st.setSname("prachi");
			st.setContact("9423878729");
			break;
		case 2:
			System.out.println("Enter Id to be retrieved");
			id = scan.nextInt();
			st = sdao.getStudent(id);
			System.out.println(st);
			break;
		case 3:
			System.out.println("Enter Id to be updated");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter new Student Name :");
			String Sname = scan.nextLine();
			sdao.updateStudent(id);
			break;
		case 4:
			System.out.println("Enter Id to be Deleted");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Student id :");
		
	        
		}

	}

}
