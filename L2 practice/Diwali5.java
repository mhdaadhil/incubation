import java.util.Scanner;
public class Diwali5{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the size of the array");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("enter elements");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	    System.out.println("enter the sum");
		int k=sc.nextInt();
		int max=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
				if(k==sum)
				{
					max=max>j-i+1?max:j-i+1;
				}
			}
		}
		System.out.println(max);
	  
  }
}