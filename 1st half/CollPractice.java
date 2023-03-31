import java.util.Scanner;
import java.util.ArrayList;
public class CollPractice{
    public static void main(String []args){
	StuProcess stu=new StuProcess();
	stu.view();
	
        
		
	}
	
}
class Student{
	int rollno;
	String name;
	int mark;
	public Student(int rollno,String name,int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	public String toString(){
		
		return rollno+"\t"+name+"\t"+mark;
	}
	
}
class StuProcess{
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> al = new ArrayList<Student>();
	
	public void view(){
		System.out.println("1.addstu\n2.insert\n3.print\n4.edit");
		
		int n =sc.nextInt();
		switch (n){
			
			case 1:
			addstu();
			break;
			case 2:
			insert();
			break;
			case 3:
			print();
			break;
			case 4:
			edit();
			break;
		}
	}
	public void addstu(){
		
		System.out.println("enter the number of student");
		int n =sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("enter the roll no");
			int rollno=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the mark");
			int mark=sc.nextInt();
			al.add(i,new Student(rollno,name,mark));
		}
		view();
	}
	public void print(){
		
		System.out.println("rollno\tname\tmark");
	
		for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	view();
	}
	public void insert(){
		System.out.println("enter the index you want to insert");
		int m=sc.nextInt();
	   	System.out.println("enter the roll no");
			int rollno=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the mark");
			int mark=sc.nextInt();
			al.add(m,new Student(rollno,name,mark));
			
			view();
	}
	public void edit(){
	    System.out.println("enter the rollno");
		int i=al.indexOf(sc.nextInt());
		System.out.println(i);
		 System.out.println("1.rollno\n2.name\n3.mark");
		 int m =sc.nextInt();
		 
		 switch(m){
			case 1:
			al.get(i).rollno=sc.nextInt();
			break;
			case 2:
			al.get(i).name=sc.next();
			break;
			case 3:
			al.get(i).mark=sc.nextInt();
			break;
		 }
		
		view();
			
	}
	
} 