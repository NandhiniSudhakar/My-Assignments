package org.student;

import org.college.College;
import org.system.Desktop;
import org.department.Department;
import org.student.Student;
//public class Student extends College{
	
public class Student extends Department{



	

	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Dept");
	}
	public void studentId() {
		System.out.println("Student Id");
	}
	
	
	public static void main(String[] args) {
		
		Student objstudent= new Student();
		objstudent.collegeCode();
		objstudent.collegeName();
		objstudent.collegeRank();
		objstudent.studentDept();
		objstudent.studentId();
		objstudent.studentName();
		objstudent.deptName();
	}

}





