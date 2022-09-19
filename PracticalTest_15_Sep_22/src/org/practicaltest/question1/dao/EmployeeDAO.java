package org.practicaltest.question1.dao;

import org.practicaltest.question1.model.Employee;

public class EmployeeDAO {

	Employee[]employeeArray=new Employee[10];
	static int i=0;
	public String setEmployee(Employee employee) {
		
		employeeArray[i]=employee;
		i++;
		return "successfully added the employee deatils";
	}
	public Employee[] displayEmployeeDetails() {
		
		return employeeArray;
	}
}
