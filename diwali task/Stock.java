import java.util.Scanner;
public class Stock{
  public static void main(String[]args){
	  Scanner sc = new  Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("enter the k");
	  int k=sc.nextInt();
	  System.out.println("enter the number");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int sum=0;
	  for(int i=0;i<n-1;i++)
	  {
		  if(k==0)
			  break;
		  
		  if(arr[i+1]>arr[i])
		  {
			sum+=arr[i+1]-arr[i];
			k--;
			i++;
		  }
	  }
	  System.out.println(sum);
  }
}