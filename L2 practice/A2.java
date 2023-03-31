import java.util.Scanner;
public class A2{
  public static void main(String []args){
	  Scanner sc = new Scanner(System.in);
	  int num=sc.nextInt();
	  int rev=0;
	  int flag=0;
	  while(num!=0 )
	  {
		  int rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	  }
	  System.out.println(rev);
	  if(rev==0||rev==1)
		  flag=1;
	  for(int i=2;i<rev/2;i++)
	  {
		  if(rev%i==0)
			  flag=1;
		      break;
	  }
	  if(flag==0)
		  System.out.println("prime num");
	  else 
		  System.out.println("not prime num");
  }
}