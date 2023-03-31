import java.util.Scanner;
public class Banking{
   public static void main(String[]args){
	   Bank b = new Bank();
	   b.show();
   }
}
class Bank{
	
	Scanner sc = new Scanner(System.in);
	int custid[]=new int[10];
	int Accno[]=new int[10];
	String name[]=new String[10];
	int bal[]=new int[10];
	String encpass[]=new String[10];
	int k=4;
	int id=44;
	int ac=44044;
	int ba=10000;
	int index=0;
	//Scanner sc = new Scanner(System.in);
	String trantype[]=new String[10];
	int amtt[]=new int[10];
    int balc[]=new int[10];
	int inc=0;
	public void show(){
		
		System.out.println("1.coustomer details\n2.add coustomer\n3.login for online transaction");
		int n =sc.nextInt();
	    switch(n){
			case 1:
			cusDetails();
			break;
			
			case 2:
			addcus();
			break;
			
			case 3:
			transaction();
			break;
		}
	}
	public void transaction(){
		System.out.println("enter the coustomer Id");
		int ci=sc.nextInt();
		System.out.println("enter the password");
		String pwd=sc.next();
		String pwd1=encryption(pwd);
		int flag=0;
		for(int i=0;i<k;i++)
		{
			if(custid[i]==ci && encpass[i].equals(pwd1) )
			{
				index=i;
				flag=1;
				break;
			}
			else
				flag=0;
		}
		if(flag==1)
		{
			System.out.println("authentication completed\n.................................");
			oper();
		}
		else{
			System.out.println("wrong custid & password try again");
			show();
		}
	}
	public void oper(){
		
		System.out.println("1.ATM\n2.Cash Deposit\n3.Account Transfer\n4.Transaction history\n5.exit");
			int n =sc.nextInt();
			switch (n){
				case 1:
				atm();
				break;
				
				case 2:
				cashdepo();
				break;
				
				case 3:
				acctrans();
				break;
				
				case 4:
				transHis();
				break;
				
				case 5:
				show();
				break;
			}
		}
	public void transHis(){
		System.out.println("transId\tTransType\tAmount\tBalance");
		for(int i=0;i<inc;i++)
		{
			System.out.println((i+1)+"\t"+trantype[i]+"\t"+amtt[i]+"\t"+"\t"+balc[i]);
		}
		oper();
	}
	public void atm(){
		System.out.println("welcome to Atm\n.............");
		System.out.println("enter the money you want to withdraw");
		int n=sc.nextInt();
		if(bal[index]-n>=1000)
		{
			trantype[inc]="ATMWithdrawal";
			amtt[inc]=n;
			bal[index]-=n;
			balc[inc]=bal[index];
			inc++;
			System.out.println("your current balance is "+bal[index]);
			oper();
		}
		else{
			System.out.println("please maintain min bal 1000rs");
			atm();
		}
	
	}
	public void cashdepo(){
		System.out.println("welcome to cash deposit\n.............");
		trantype[inc]="CashDeposit";
		System.out.println("enter the money you want to deposit");
		int n=sc.nextInt();
		amtt[inc]=n;
		bal[index]+=n;
		balc[inc]=bal[index];
		inc++;
		
		System.out.println("cash deposit is sucessful\nyour current balance is "+bal[index]);
		oper();
	}
	public void acctrans(){
		System.out.println("welcome to Account Transfer\n.............");
		
		System.out.println("enter the account number that you want to deposit");
	    int n =sc.nextInt();
		int f=0;
		int ind=0;
		for(int i=0;i<k;i++)
		{
		if(Accno[i]==n){
			f=1;
			ind=i;
			break;
		}
		else 
			f=0;
		}
		if(f==1)
		{
			trantype[inc]="AccountTransfer";
			System.out.println("account holder is "+name[ind]);
			System.out.println("enter the amount you want to transfer");
			int amt=sc.nextInt();
			amtt[inc]=amt;
			
			if(bal[index]-amt>=1000)
			{
				bal[ind]+=amt;
				bal[index]-=amt;
				balc[inc]=bal[index];
		        inc++;
				System.out.println("your account balance is "+bal[index]);
				oper();
				
			}
			else{
				System.out.println("you should have min bal 1000");
				acctrans();
			}
			
		}
		else{
			System.out.println("there is no account in this number");
			transaction();
		}
	}     
	public void addcus(){
		//++k;
		/*System.out.println("enter how acc to create");
	     int n =sc.nextInt();
    for(int i=0;i<n;i++,k++)
    {*/
		id+=11;
		ac+=11011;
        custid[k]=id;
		Accno[k]=ac;
		System.out.println(" enter the name ");
	    name[k]=sc.next();
		bal[k]=ba;
		System.out.println("enter the password");
		String pass=sc.next();
		System.out.println("re enter the password");
		String pass1=sc.next();
		if(pass.equals(pass1)){
	     	encpass[k]=encryption(pass);
		}
		else{
			System.out.println("wrong password try again");
			addcus();
		} 
		k++;
	
		show();
	 }
	public String encryption(String pass){
		char arr[]=pass.toCharArray();
		String encp="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='z')
			{
				arr[i]='a';
				encp=encp+arr[i];
			}
			else if(arr[i]=='Z')
			{
				arr[i]='A';
				encp=encp+arr[i];
			}
			else if (arr[i]=='9')
			{
				arr[i]='0';
				encp=encp+arr[i];
			}
			else
			{
				arr[i]++;
				encp=encp+arr[i];
			}
			
		}
		return encp;
	
	}
	public void cusDetails(){
    custid[0]=11;
	custid[1]=22;
	custid[2]=33;
	custid[3]=44;
	
	Accno[0]=11011;
	Accno[1]=22022;
	Accno[2]=33033;
	Accno[3]=44044;
	
	name[0]="kumar";
	name[1]="madu";
	name[2]="rahul";
	name[3]="robin";
	
	bal[0]=10000;
	bal[1]=10000;
	bal[2]=10000;
	bal[3]=10000;
	
	encpass[0]="Apipnbjm";
	encpass[1]="cbolijoh";
	encpass[2]="dbnqvat";
	encpass[3]="kbwb22";
	System.out.println("cusrid\tAccountNo\tName\tBalance\tEncrypted pwd");
	for(int i=0;i<k;i++)
	{
		
		System.out.println(custid[i]+"\t"+Accno[i]+"\t\t"+name[i]+"\t"+bal[i]+"\t"+encpass[i]);
	}
	show();
}
}