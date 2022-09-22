package org.practicaltest.service;

import org.practicaltest.dao.StudentDAO;
import org.practicaltest.model.Student;

public class StudentService {
	
    StudentDAO studentDAO= new StudentDAO();
    
	public String setStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentDAO.setStudent(student);
	}

}
	
