import java.util.Scanner;
public class L3app{
	public static void main(String[] args){
         Taxi tax= new Taxi();
		 tax.details();
	}
}
class Taxi{
	Scanner sc = new Scanner(System.in);
	char point[]=new char[5] ;
	String taxi[]=new String[5];
	int bookingid[]=new int[10];
	int customerid[]=new int[10];
    String from[]=new String[10];
	String to[]=new String[10];
	int pick[]=new int[10];
	int drop[]=new int[10];
	//int m[]=new int[5]
	int id=0;
	int k=0;
	int flag=0;
	int j=0;
	public void details(){
		point[0]='A';
		point[1]='B';
		point[2]='C';
		point[3]='D';
		point[4]='E';
		
	  System.out.println("enter the taxi details ");
	      for(int i=0;i<5;i++)
		  {
			 taxi[i]='A'; 
		  }
		  booktaxi();
		  
	}
public void booktaxi(){
	System.out.println("enter the 1 for book taxi");
	int n=sc.nextInt();
	if (n==1)
	{
		id+=1;
		System.out.println("Customer ID:"+id);
		System.out.println("pickup point:");
		from[k]=sc.next();
		System.out.println("drop point:");
		to[k]=sc.next();
		System.out.println("pickup time:");
		pick[k]=sc.nextInt();
		k++;
		
		for(int i=0;i<5;i++)
        {
			if(taxi[i].equals(from[k])||taxi[i].equals(from[k]+1)||taxi[i].equals(from[k]-1))
			{
				System.out.println("Taxi can be allotted");
				System.out.println("Taxi"+i+1+"is allotted");
				taxi[i]=to[k];
				break;
				
			}
			else 
			{
				continue;
			}
		}
		
	}
}

}




























