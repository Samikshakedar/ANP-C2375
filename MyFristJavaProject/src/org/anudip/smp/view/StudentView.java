package org.anudip.smp.view;
import org.anudip.smp.model.Student;
public class StudentView {
public static void main(String[] args) {
	Student studentObj1; 
	studentObj1=new Student();
	
	Student studentObj2=new Student();
	
	Student studentObj3=new Student(2,'B',23);
	
		char name=studentObj3.getStudentName();// calling method // arguments
	System.out.println("studentObj3 "+name);
	System.out.println("studentObj1 name "+studentObj1.getStudentName());
	
	studentObj3.setStudentName('C');
	name=studentObj3.getStudentName();// calling method // arguments
	System.out.println("studentObj3 "+name);
	
	
	
}
}

