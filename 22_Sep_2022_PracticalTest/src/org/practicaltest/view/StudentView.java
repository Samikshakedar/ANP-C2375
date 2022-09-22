package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

public class StudentView {
	
	static Scanner sc=new Scanner(System.in);
	StudentService studentService=new StudentService();
	
   public void acceptStudentData() {
		// TODO Auto-generated method stub
	   System.out.println("Enter 10 Student Details");
	   for(int i=0;i<10;i++) {
		   
		  System.out.println("Enter Student Details");
		  System.out.println("Enter the Student id");
		  int id=(sc.nextInt());
		  
		  System.out.println("Enter Student Age ");
		  int Age=(sc.nextInt());
		  sc.nextLine();
		  
		  System.out.println("Enter Student Name");
		  String Name=(sc.nextLine());
		  
		  System.out.println(studentService.setStudent(new Student(id,Age,Name)));

		}
     }
}
