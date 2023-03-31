import java.util.Scanner;


public class Module {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Home obj1=new Home();
		obj1.home1();
	}

}
class Home
{
	public void home1(){
		Admin obj2 = new Admin();
		User obj3=new User();
		System.out.println("1.admin");
		System.out.println("2.user");
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		switch(input)
		{
		case 1:
			obj2.admin1();
			break;
		case 2:
			obj3.user1();
			break;
		default:
		System.out.println("enter the correct num");
		break;	
		}
	}
	
}
class Admin
{
	public void admin1()
	{
		
		Scanner sc1=new Scanner(System.in);
		Signup obj4 = new Signup();
		Signin obj5 = new Signin();
		System.out.println("1.sign up");
		//System.out.println("2.sign in");
		int input1=sc1.nextInt();
		switch(input1)
		{
			case 1:
				obj4.signup1();
				break;
			case 2:
				obj5.signin1();
			default:
				System.out.println("enter the correct num");
				break;					
		}
	}
}
class User
{
	public void user1(){
		//System.out.println("user called ");
		Signup obj6= new Signup();
		Signin obj7= new Signin();
		System.out.println("1.sign up");
		System.out.println("2.sign in");
		Scanner sc2= new Scanner (System.in);
		int input2=sc2.nextInt();
		switch (input2)
		{
		case 1:
			obj6.signup1();
			break;
		case 2:
			obj7.signin1();
			break;
		default:
			System.out.println("enter the correct num");
			break;
		}
		
	}
}
class Signup
{
public void signup1(){
	
	
	Scanner sc3 = new Scanner (System.in);
	System.out.println("enter the user name : ");
	String str = sc3.next();
	System.out.println("enter the password ");
	String password = sc3.next();
	char arr[]=password.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		if (arr[i]<=65&&arr[i]>=90 || arr[i]==45 && arr[i]==64){
			System.out.println("it is a strong password ");	
		}
		else{
			System.out.println("its is not a strong password");
			break;
			
		}
	}
	System.out.println("successfully you sgined up");
	System.out.println("1.admin");
	System.out.println("2.user");
	System.out.println("3.sgin up");
	Admin obj8 = new Admin();
	User obj9 = new User();
	Signin obj10=new Signin();
	
	int input4=sc3.nextInt();
	 
	switch (input4)
	 {
	case 1 :
		obj8.admin1();
		break;
	case 2:
		obj9.user1();
		break;
	case 3:
		obj10.signin1();
		break;
	default:
		System.out.println("enter the correct num");
		break;	
	 }
	
	
	
}	
}
class Signin
{
	public void signin1(){
	System.out.println("sign in obj called ");
	}
}
