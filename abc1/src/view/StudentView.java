package view;

import java.util.TreeSet;
import service.StudentService;

public class StudentView {
 public static void main(String[] args) {
	 StudentService s1=new StudentService();
	 s1.addString("abc");
	 s1.addString("xyz");
	 TreeSet<String> studentName=s1.getStringTreeset();
	 System.out.println(studentName);
 }
}