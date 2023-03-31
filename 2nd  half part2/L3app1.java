import java.util.Scanner;
public class L3app1{
	public static void main(String[] args){
		Taxi tax=new Taxi();
		tax.select();
	}
}
class Taxi{
	Scanner sc = new Scanner(System.in);
	int bookingid[]=new int[10];
	int customerid[]=new int[10];
    char from[]=new char[10];
	char to[]=new char[10];
	int pick[]=new int[10];
	int drop[]=new int[10];
	char taxi[]=new char[5];
	int k=0;
	int flag=0;
	int id=0;
	public Taxi(){
		
		for(int i=0;i<5;i++)
		  {
			 taxi[i]='A'; 
		  }
	}
	
	
	
	public void select(){
		
		System.out.println("1.taxibook\n2.bookdetail\n3.taxilocation");
		int n =sc.nextInt();
		switch (n){
			case 1:
			booktaxi();
			break;
			case 2:
			bookdetail();
			break;
			case 3:
			taxilocation();
			break;
		}
	}
	public void taxilocation(){
		 System.out.println("taxi 1\ttaxi 2\ttaxi 3\ttaxi 4\ttaxi 5");
		 for(int i =0;i<5;i++)
		 {
			 System.out.print(taxi[i]+"\t");
		 }
		 select();
	}
	
	public void booktaxi(){
		id+=1;
		System.out.println("Customer ID:"+id);
		System.out.println("pickup point:");
		from[k]=sc.next().charAt(0);
		System.out.println("drop point:");
		to[k]=sc.next().charAt(0);
		System.out.println("pickup time:");
		pick[k]=sc.nextInt();
		
		System.out.println(to[k]+" "+from[k]);
		for (int i=0;i<5;i++)
		{
		for (int j=0;j<5;j++)
		{
			if(taxi[i]+j==from[k]||
			)
		}
		}
		k++;
	    select();
		
		
	}
	public void bookdetail()
	{
		
	}
	

}