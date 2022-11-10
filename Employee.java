//Q1.Create a class Employee----name ,age,department and salary.

  //add instance of 6 Employees in a collection.



package StreamAPI.com;

import java.util.Comparator;

public class Employee {


	//data members of employee class
	private String name;
	private int age;
	private String dept;
	private Double salary;

	public class EmployeeNameSorter implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
		
		public Employee(String name,int age, String Department, Double salary) {
			super();
			this.name = name;
			this.age = age;
			this.dept = dept;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public int getage() {
			return age;
		}
		public String getEmail() {
			return dept;
		}
		public Double getSalary() {
			return salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age +", dept =" + dept + ", salary=" + salary + "]";
		}
	}