package service;

import java.util.TreeSet;
import dao.StudentDAO;

public class StudentService {
	StudentDAO s1=new StudentDAO();
    public void addString(String s) {
    	
	   s1().addString(s);
    }
	private StudentDAO s1() {
		// TODO Auto-generated method stub
		return null;
	}
	public TreeSet<String> getStringTreeset(){
	    return s1().getStringTreeset();
	
 }
}
