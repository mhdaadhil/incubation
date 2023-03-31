import java.util.Scanner;
public class L3Ex{
   public static void main(String[]args){
	   Scanner sc =new Scanner(System.in);
	   
	  
	   System.out.println("1. create account");
	   int n=sc.nextInt();
	   switch(n)
	   {
		   case 1:
		    Zcoins zc = new Zcoins();
		    zc.createAccount();
		    break;
	   }
	   
   }
}
class Details{
	String fullname;
	String emailid;
	long mobno;
	String hid;
	String password;
    int realcurrency;
	public Details(String fullname,String emailid,long mobno,String hid,String password,int realcurrency){
		this.fullname=fullname;
		this.emailid=emailid;
		this.mobno=mobno;
		this.hid=hid;
		this.password=password;
		this.realcurrency=realcurrency;
	}
	public String toString(){
		
		return fullname+" "+emailid+" "+mobno+" "+hid+" "+password+" "+realcurrency;
	}
	
}
class Conform{
	
	String fullname;
	String emailid;
	long mobno;
	String hid;
	String password;
    int realcurrency;
	public Conform(String fullname,String emailid,long mobno,String hid,String password,int realcurrency){
		this.fullname=fullname;
		this.emailid=emailid;
		this.mobno=mobno;
		this.hid=hid;
		this.password=password;
		this.realcurrency=realcurrency;
	}
	
}


class Zcoins{
	Scanner sc = new Scanner(System.in);
	Details[]det=new Details[10];
	Conform[]con=new Conform[10];
	int i=0;
	int j=0;
	
	public void createAccount(){
		System.out.println("enter the full name");
		String fullname=sc.next();
		System.out.println("enter the email id");
		String emailid=sc.next();
		System.out.println("enter the mobile no");
		long mobno=sc.nextLong();
		System.out.println("enter the gov id");
		String hid=sc.next();
		String password=passgen();
		System.out.println(password);
		System.out.println("deposit amount");
		int realcurrency=sc.nextInt();
	    det[i]=new Details(fullname,emailid,mobno,hid,password,realcurrency);
		i++;
		System.out.println("-------------------------------------------------------------------------");
	    show();
	}
	public void show(){
		System.out.println("1.agent login\n2.user login\n3.create Account");
		int n=sc.nextInt();
		switch(n){
			case 1:
			agentLogin();
			break;
			
			case 2:
			userLogin();
			break;
			
			case 3:
			createAccount();
			break;
		}
		System.out.println("-------------------------------------------------------------------------");
		
	}
	
	public void userLogin(){
	
		System.out.println("enter the email id");
		String emailid=sc.next();
		System.out.println("enter the password");
		System.out.println(det[0].password);
		String password=sc.next();
		int flag=0;
	    for(int i=0;i<j;i++)
		{
			//System.out.println("enter the password");
			if(con[i].emailid.equals(emailid)&&con[i].password.equals(password)){
				int ind =i;
				//userPannel();
				flag=1;
				break;
			}
			
			
			else{
				flag=0;
			}
		}
		for(int k=0;k<i;k++){
			
			if(det[k].emailid.equals(emailid)&&det[k].password.equals(password)){
				System.out.println("still agent didnt apporove your acc ");
				show();
			}
		}
		
         if(flag==1)
         {
			 System.out.println("you succesfully loged in");
			 userPannel();
		 }
         else
		 {
			System.out.println("wrong password try again");
            show();			
		 }			 
	}
	public void userPannel(){
		System.out.println("welcome to user pannal");
		System.out.println("1.account details\n2.");
		
	}
	public void agentLogin(){
		
      String s="Admin123";
	  String pass="Admin123";
	  
	  System.out.println("enter the agent name");
	  String name=sc.next();
	  System.out.println("enter the password");
	  String pas=sc.next();
	  
	  if(s.equals(name)&&pass.equals(pas))
	  {
		  System.out.println("agent longin sucessfull");
		  agentPannel();
	  }
	  else{
		  System.out.println("invalid user name password");
		  show();
	  }
	  
	}
	public void agentPannel(){
		System.out.println("1.apporve\n2.user transaction");
		int n=sc.nextInt();
		switch(n){
			case 1:
			apporove();
			break;
			
			case 2:
			usertranstion();
			break;
		}
	}
	public void apporove(){
		for(int k=0;k<i;k++){
			System.out.println(det[k]);
		}
		System.out.println("enter their gov id for apporove");
		int n =sc.next();
		for(int z=0;z<i;z++)
		{
			if(det[z].hid.equals(n))
		}
		
	
		
	}
	public void usertranstion(){
		
	}
	
	
	public String passgen(){
		
		int num=0;
		int spl=0;
		int low=0;
		int cap=0;
		int n=1;
		String s="";
		boolean flag=true;
	    while(n!=0)
		{
			
		s+=sc.next();
		 char arr[]=s.toCharArray();
		
            for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=33&&arr[i]<=47||arr[i]>=58&&arr[i]<=64)
				  spl++;
			    if(arr[i]>=65&&arr[i]<=90)
				  cap++;
			    if(arr[i]>=97&&arr[i]<=122)
				  low++;
			    if(arr[i]>=48&&arr[i]<=57)
				  num++;
			}
			if(s.length()>=8&&num>=1&&low>=1&&cap>=1&&spl>=1)
				n=0;
			    
			else{ 
				System.out.println("password invalid it shoulb be length more then 8letters and have sp num cap and low");
			    flag=false;
			}
		}
		if(flag=true)
			return s;
		
		return null;
	} 
}