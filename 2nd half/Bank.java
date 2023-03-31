import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.AccountLogin\n2.Purchace");
		int n=sc.nextInt();
		switch (n)
		{
			case 1:
			AccountLogin al = new AccountLogin();
			al.login();
			break;
			case 2:
			Purchace pur = new Purchace();
			
		}
	}
}
class AccountLogin{
	int balance=10000;
    String user;
	String pass;
	int num[]=new int[5];
	int pin[]=new int[4];
	int size=0;
	int amt[]=new int[size];
	
	int i=0;
	
	
	Scanner sc = new Scanner(System.in);
	public void login(){
		System.out.println("1.signin\n2.signup");
		int m=sc.nextInt();
		switch(m){
			case 1:
			signin();
			break;
			case 2:
			signup();
			break;
		}
	}
	public void signup(){
		System.out.println("enter the user name ");
	    user = sc.next();
		 System.out.println("enter the password ");
		 pass =sc.next();
		 System.out.println("succssfully Signed up ");
		 login();
	   
	}
	public void signin(){
		System.out.println("enter the user name");
		String userr =sc.next();
		System.out.println("enter the password");
		String passs=sc.next();
		
		if(userr.equals(user)&&passs.equals(pass))
		{
			 System.out.println("succssfully Signed in ");
			 accountDetails();
			 
		}
		else {
			 System.out.println("Try again");
			 login();
		}
		 
	}
	public void accountDetails(){
		System.out.println("1.Create Gift Card \n2.TopUp\n3.Transaction History\n4.Block\n5.Logout");
		int c=sc.nextInt();
		switch (c){
			case 1:
			createGiftCard();
			break;
			case 2:
			topUp();
			break;
			case 3:
			transactionHistory();
			break;
			case 4:
			Block();
			break;
			case 5:
			Logout();
			break;
	    }
		
		
	}
	public void createGiftCard(){
			System.out.println("generate card number");
			
			for(int i=0;i<5;i++)
			    num[i]=sc.nextInt();
		   
		    System.out.println("enter the pin");
			 for(int i=0;i<4;i++)
				 pin[i]=sc.nextInt();
			 
			 System.out.println("Succsfully card Generated");
			 accountDetails();
			
		}
		public void topUp(){
		    size++;
			
			for(i=0;i<size;i++){
			System.out.println("enter the amount that you want to top up ");
			amt[i]=sc.nextInt();
	        balance-=amt[i];
			}
			accountDetails(); 
		
			
			
			
		}
		public void transactionHistory(){
			for(int  i =0;i<size;i++){
			System.out.println("top up =" +amt[i]+" and balance ="+balance);
		}
		accountDetails();
		}
		public void Block(){
			
		}
		public void Logout(){
			
		}
	

	
		
	
	
	
}

class Purchace{
	
}