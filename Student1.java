import java.util.Scanner;
class Student1{
	String name;
	int age;
	int mark;
	Student1(String n, int a, int m){
	name = n;
	age = a;
	mark = m;
	}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Student1 s1 = new Student1("Ayushi",21,83);
	System.out.println(s1.name); 
	System.out.println(s1.age); 
	System.out.println(s1.mark); 
	Student1 s2 = new Student1("Shukla",25,56);
	System.out.println(s2.name); 
	System.out.println(s2.age); 
	System.out.println(s2.mark); 

	sc.close();
	}
}

