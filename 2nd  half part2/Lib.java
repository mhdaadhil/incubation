import java.util.Scanner;
public class Lib{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		User us =new User();
		String adminname = "mo";
		String password = "Aa";
		System.out.println("1.admin\n2.user");
		int n=sc.nextInt();
		
		switch (n){
			case 1:
			us.signin(adminname,password);
			break;
			
			case 2:
			us.home();
			break;
			
			default:
			System.out.println("enter the correct number");
		}
		
		
	}
}
class Admin extends Lib
{
	   int a=1;
	    static int c;
		int k=2;
	   Scanner sc = new Scanner (System.in);
	   static String arr[]=new String[50];
	  static int id[]=new int[50];
	  static int cost[]=new int[50];
	   static int count[]=new int [50];
	public void signin(String adminname,String password)
	{
		 Scanner sc = new Scanner (System.in);
		System.out.println("welcome to admin signin page");
		while (a!=0)
		{
			
			System.out.println("enter the admin name ");
			String adname=sc.next();
			System.out.println("enter the password");
			String  pass=sc.next();
		
			if (adname.equals(adminname)&&pass.equals(password))
				{
					a=0;
				}
			if (a==0)
				System.out.println("signed in succesfully");
				
			else 
			System.out.println("INVALID ! username password ");
		}
		choose();
	
		 
		 
		
	}
	public void view()
		 {
			 arr[0]="Sutish the warrior";
	         arr[1]="anas the legend";
			 cost[0]=340;
			 cost[1]=450;
			 count[0]=5;
			 count[1]=6;
			 id[0]=1;
			 id[1]=2;
			System.out.println("SI.NO \t ID \t\t BOOK NAME \t\t\t COST \t COUNT");
			int si=0;
			for(int i=0;i<c+2;i++)
			 {
				 ++si;
				 System.out.println(si+".\t"+id[i]+"\t\t"+arr[i]+"\t\t\t"+cost[i]+"\t"+count[i]);
			 }
			// choose();
		 }
    	private void addnew()
		{
			 Scanner sc = new Scanner (System.in);
	         System.out.println("how many book ");
		     c=sc.nextInt();
		
			for (int i=2;i<c+2;i++)
			{
				System.out.println("enter the book name");
				arr[k]=sc.nextLine();
				arr[k]=sc.nextLine();
				System.out.println("enter the book id ");
				id[k]=sc.nextInt();
				System.out.println("enter the cost");
				cost[k]=sc.nextInt();
				System.out.println("enter the book count");
				count[k]=sc.nextInt();
				k++;
			}
	    }
		 private void updateid()
		 {
		    System.out.println("********************enter the position that you want to update*******************");
			int pos=sc.nextInt()-1;
			String book =sc.nextLine();
			
			System.out.println("enter the book name ");
			book =sc.nextLine();
			arr[pos]=book;
			
			System.out.println("enter the book id ");
			int idd=sc.nextInt();
			id[pos]=idd;
			
			System.out.println("enter the cost of the book");
			int price =sc.nextInt();
			cost[pos]=price;
			
			System.out.println("enter the stockes");
			int stock=sc.nextInt();
			count[pos]=stock;
			
			//for (int i=1;i<=c;i++)
			//System.out.println(arr[i]);
            System.out.println(".........................SUCCESSFULLY UPDATED.................................");			
			
			view();
			//choose();
		}
		 private void deleteid()
		 {

			System.out.println("*******************************enter the position that you want to delete******************************");
			int pos=sc.nextInt()-1;
             if(pos < 0 || pos > c)
			 {
				 System.out.println("Invalid position! Please enter position between 1 to "+ c);
			 }
			 else 
			 {
				 for(int i=pos; i<=c; i++)
                 {
                    arr[i] = arr[i + 1];
					id[i]=id[i+1];
					cost[i]=cost[i+1];
					count[i]=count[i+1];
				 }
				 c--;
				  System.out.println("********************SUCCESSFULLY DELETED ***********************");
			 } 
               //choose();			 
		 }	
		 public void choose(){
			 boolean t=true;
			 while(t)
			 {
				 System.out.println("1.view 2.addnew 3.updateid  4.deleteid 5.Logout");
				int d=sc.nextInt();
			  switch(d)
			    {
					case 1:
						view();
						break;
					case 2:
						addnew();
						break;
					case 3:
						updateid();
						break;
					case 4:
						deleteid();
						break;
					case 5:
				        Lib.main(null);
						t=false;
						break;
				
					default:
					System.out.println("enter the correct number");
			    }
			 }
		 }
}
	
class User extends Admin {
	String str;
	String pass;
	Scanner sc = new Scanner(System.in);
	Admin ad=new Admin();
	
	public void home(){
	    System.out.println("1.signup 2.signin");
		int e=sc.nextInt();
		switch(e){
			case 1:
			signup();
			break;
			case 2:
			signin();
			break;
		}
	}
	
	   public void signup(){
		   int n=1,spl=0,num=0,low =0,cap=1;
	System.out.println("enter the user name to sign up : ");
	str = sc.next();
	System.out.println("enter the password ");
	while (n!=0){
	   pass = sc.next();
	   char arr[]= pass.toCharArray();
	   for (int i=0;i<pass.length();++i){
		if (arr[i]>=33 && arr[i]<=47 || arr[i]== 64)
    	    		spl=1;
    	    	if (arr[i]>=46 && arr[i]<=57)
    	    		num=1;
    	    	if (arr[i]>=65 && arr[i]<=90)
    	    		low=1;
    	    	if (arr[i]>=97 && arr[i]<=122)
    	    		cap=1;
			}
			if (spl==1 && num==1 && low==1 && cap==1)
	             n=0;
	    	 else 
	    		 System.out.println("password must be upper case lower case and number and spl character");
		}
		if (n==0)
			System.out.println("successfully you signed up"); 
                  signin();
		   
		}
	   public void signin()
	   {
		   System.out.println("welcome to signin page");
			Scanner sc = new Scanner (System.in);
			System.out.println("enter the user name");
			String usern= sc.next();
			System.out.println("enter the password");
			String pass1=sc.next();
				if (usern.equals(str)&& pass.equals(pass1))
				{
					System.out.println("suscessfully loged in");
				}
				else{
					System.out.println("Invalid ! username or password ");
					signup();
					}
				select();
		}
		   
	   
	   
	   public void buy(){
		   System.out.println("enter the book position that you want to buy");
			int pos =sc.nextInt();
			System.out.println("enter how many books you want to buy");
			
			int books=sc.nextInt();
			
			if (pos>1&&pos<c)
			{
				count[pos]-=books;
			}
			else
				System.out.println("enter the correct position");
				
				select();
			
	   }
	   public void read(){
		   
	   }
	   public void select()
	   {
		    System.out.println("1.view 2.buy 3.read");
		int f=sc.nextInt();
		switch(f){
			case 1:
			ad.view();
			break;
			case 2:
			buy();
			break;
			case 3:
			read();
			break;
			case 4:
			Lib.main(null);
			break;
			
			
			
		}
	   }
	}