
public class Employee {
int employeeId;
String employeeName;
Gender employeeGender;
public Employee(int employeeId, String employeeName, Gender gender) {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeGender = gender;
}
public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public Gender getEmployeeGender() {
	return employeeGender;
}

public void setEmployeeGender(Gender employeeGender) {
	this.employeeGender = employeeGender;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeGender="
			+ employeeGender + "]";
}
}
