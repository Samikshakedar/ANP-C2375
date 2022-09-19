
public class StringDemo {
	public static void main(String[] args) {
		String str1=new String("Hello Everybody");
		String str2="Hello";
		String str3="Everybody";
		System.out.println("str3.charAt(0)");
		char var=str3.charAt(4);
		System.out.println(var);
		System.out.println(str3.indexOf(var));
		str3.length();
		str3.toLowerCase();
		str3.toUpperCase();
		String s1=new String("Hello Everybody");
		String s2=new String("Hello everybody");
		String s3="Hello";
		String s4="Hello";
		boolean result1=s1==s2;
		System.out.println(result1);
		boolean result2=s1.equals(s2);
		System.out.println(result2);
		String str4="Welcome to Java Programming Language";
		String str4Split[]=str4.split("\t");
		for(String str:str4Split)
			System.out.println(str);
		
		int compareVar=s3.compareTo(str4);
		System.out.println(compareVar);
		
	}

}
