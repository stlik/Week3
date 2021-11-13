package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentname() {
		System.out.println("Stalin K");
	}
	
	public void studentDept() {
		System.out.println("Mechanical");
	}
	
	public void studentid() {
	System.out.println("1911");
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.collegeCode();
		stu.collegename();
		stu.collegeRank();
		stu.deptname();
		stu.studentDept();
		stu.studentid();
		stu.studentname();
	}
	
	
	

}
