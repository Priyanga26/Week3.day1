package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {

		System.out.println("Student Name");
	}
	
	public void studentDept() {

		System.out.println("Student Dept");
	}
	
	public void studentid() {

		System.out.println("Student ID");
	}

	public static void main(String[] args) {

		
		Student Std = new Student();
		
		Std.collegeCode();
		Std.collegeName();
		Std.collegeRank();
		Std.deptName();
		Std.studentDept();
		Std.studentid();
		Std.studentName();
		
	}

}
