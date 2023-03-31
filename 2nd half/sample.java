import java.util.Scanner;
public class Sample{
	public static void main(String[]args ){
		BookTicket[] b =  new BookTicket[10];
		for(int i=0;i<2;i++){
		    Scanner s=new Scanner(System.in);
			String name=s.next();
			int age=s.nextInt();
			b[i]=new BookTicket(name,age);
		}
		
	}
	}
	
abstract class Ticket{
	

	
}
class BookTicket extends Ticket{
	String name;
	int age;
	public BookTicket(String name,int age){
		this.name = name;
		this.age = age;
	}
}
class CancelTicket extends Ticket{
	
}
