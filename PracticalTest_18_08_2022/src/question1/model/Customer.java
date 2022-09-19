package question1.model;

 public class Customer {
	
	private int id;
	private String name;
	private int age;
public  Customer (){
	 
}
public Customer (int Id , String Name, int Age ) {
	id = Id;
	name = Name;
	age = Age;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
