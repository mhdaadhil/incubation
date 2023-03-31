import java.util.Scanner;
public class Moded{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Login log= new Login();
		log.log();
		
		
		
	}
}
class Login{
	String name;
	String pass;
	int n=0;
	Scanner sc = new Scanner(System.in);
	public void log(){
		int n=sc.nextInt();
		switch(n){
			case 1:
			signup();
			break;
			case 2:
			signin();
			break;
		}
	}
	public void signup(){
		System.out.println("create username ");
		name=sc.next();
		System.out.println("create pasword");
		pass=sc.next();
		
		System.out.println("your account is created");
		log();
		
	}
	public void signin(){
		System.out.println("enter username ");
		String username =sc.next();
		System.out.println("enter  pasword");
		String password=sc.next();
		
	   if (username.equals(name)&&password.equals(pass))
	   {
		   System.out.println("succesfully signin ");
	   }
	   else{ 
		    System.out.println("try again");
		     log();
	   }
	}
}
