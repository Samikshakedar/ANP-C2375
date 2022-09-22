package org.practicaltest.dao;

import java.util.TreeSet;

import org.practicaltest.model.Student;

public class StudentDAO {
	
	TreeSet<Student>treeSet=new TreeSet<>();
	
	public String setStudent(Student student){
		// TODO Auto-generated method stub
		treeSet.add(student);
		System.out.println(treeSet);
		return "successfully added the student deatils";
	}

}