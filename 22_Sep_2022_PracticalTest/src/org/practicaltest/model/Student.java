package org.practicaltest.model;
import java.util.Objects;

public class Student implements Comparable<Student>
{
private int studentId;
private int studentAge;
private String studentName;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int studentId, int studentAge, String studentName) {
	super();
	this.studentId = studentId;
	this.studentAge = studentAge;
	this.studentName = studentName;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public int getStudentAge() {
	return studentAge;
}

public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

@Override
public String toString() {
	return "Studentview [studentId=" + studentId + ", studentAge=" + studentAge + ", studentName=" + studentName + "]";
}

@Override
public int hashCode() {
	return Objects.hash(studentAge, studentId, studentName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return studentAge == other.studentAge && studentId == other.studentId
			&& Objects.equals(studentName, other.studentName);
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.studentId-o.studentId;
}

}