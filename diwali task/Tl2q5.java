import java.util.Scanner;
public class Tl2q5{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("how many students");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the "+(i+1)+" student name : ");
			String name=sc.next();
			
			System.out.println("enter the"+ (i+1) +" ph no : ");
			int phno=sc.nextInt();
			
			System.out.println("enter the"+ (i+1) +" roll no : ");
			int rollno =sc.nextInt();
			
			System.out.println("enter the "+(i+1)+" student adress: ");
			String adress=sc.next();
			
			s[i]=new Student(name,phno,rollno,adress);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
class Student{
	String name;
	int phno;
	int rollno;
	String adress;
	public Student(String name,int phno,int rollno,String adress){
		this.name=name;
		this.phno=phno;
		this.rollno=rollno;
		this.adress=adress;
	}
	public String toString(){
		return name+" "+phno+" "+rollno+" "+adress;
	}
}