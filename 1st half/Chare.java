public class Chare {
public static void main(String[] args) {
  Student s1=new Student("john",2);
  System.out.println("student name = "+s1.name);
  System.out.println("Student rollno = "+s1.rollno);
}


}
class Student{
	String name;
	int rollno;
	public Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
}