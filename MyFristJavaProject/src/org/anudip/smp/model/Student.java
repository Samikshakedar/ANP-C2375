package org.anudip.smp.model;

public class Student {
	private int studentId;
	private char studentName;
	private int age;
	
	public Student(){
		studentId=1;
		studentName='A';
		age=21;
		System.out.println("Constructor Without Parameter");
	}
	public Student(int id,char name, int a){
		studentId=id;
		studentName=name;
		age=a;
		System.out.println("Constructor With Parameter");
	}
	public void setStudentId(int id) {
		studentId=id;
	}
	public char getStudentName() {// defining a method //parameter
		return studentName;
	}
	public void setStudentName(char name) { //parameter with datatypes
		studentName = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getStudentId() {
		return studentId;
	}	
}
