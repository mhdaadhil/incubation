import java.util.Scanner;


public class Module2{
	public static void main(String[] args) {
		Login log=new Login();
		log.home();
		
	}

}
class Login{
          public void  home (){
		System.out.println("1.admin");
		System.out.println("2.user");
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		switch (input)
		{
		case 1:
			admin();
			break;
		case 2:
			user();
			break;
		default:
			System.out.println("enter the correct num");
			break;	
		}
		
	}
	public void admin (){
		//System.out.println("method called ");
		System.out.println("1,sign up");
		Scanner sc = new Scanner (System.in);
		int input2= sc.nextInt();
		switch (input2)
		{
		case 1:
			signup();
			break;
		
		default:
			System.out.println("enter the correct num");
			break;			
		}
		
	}
	public void user(){
		//System.out.println("method called ");
		System.out.println("1.sign up");
		Scanner sc= new Scanner (System.in);
		int input3=sc.nextInt();
		switch (input3)
		{
		case 1:
			signup();
			break;
		case 2:
			signin();
			break;
		default:
			System.out.println("enter the correct num");
			break;
		}
		
	}
	public void signup(){
		int flag=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the user name : ");
		String str = sc.next();
		System.out.println("enter the password ");
		String pass = sc.next();
		//signin(str,pass);
	    System.out.println("successfully you sgined up");
	    //Scanner sc = new Scanner(System.in);
	    System.out.println("1.admin");
		System.out.println("2.user");
		System.out.println("3.sign in");
		int input4= sc.nextInt();
		switch (input4)
		{
		case 1:
			admin();
			break;
		case 2:
			user();
			break;
		case 3:
			signin(str,pass);
			break;
		default:
			System.out.println("enter the correct num");
			break;	
		}
	    
	 }
	public void signin(){
	}
	public void signin(String user,String pass){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the user name");
		String usern= sc.next();
		System.out.println("enter the password");
		String pass1=sc.next();
		if (usern.equals(user)&& pass.equals(pass1))
		{
			System.out.println("suscessfully loged in");
		}
		else
		{
			System.out.println("wrong username or password ");
		}
		
	}
		
		
		
	}
