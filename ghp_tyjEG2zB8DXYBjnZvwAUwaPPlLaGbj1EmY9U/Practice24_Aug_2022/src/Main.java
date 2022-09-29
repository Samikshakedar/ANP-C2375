import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name");
		String name=sc.nextLine();
		System.out.println("Enter employee gender");
		String sex=sc.nextLine();
		System.out.println();
		String gen=sex.toUpperCase();
		
		Employee employee1=new Employee(id,name,Gender.valueOf(sex.toUpperCase()));
		System.out.println(employee1);
		Employee employee3=new Employee(id,name,Gender.valueOf(gen));
		Employee employee2=new Employee(1,"BBBB",Gender.FEMALE);
		System.out.println("Main Method ends");
		
	}
}

