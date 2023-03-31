import java.util.Scanner;
public class Queno1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp=0;
		int count=0;
		//int j=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
	       if (i==0)
			{
				temp+=arr[i];
			}
	    else if (arr[i]%2==0)
		 {
			 temp+=arr[i];
		 }
		 else if(arr[i]%2!=0)
		 {
			if (arr[i-1]%2==0)
			{
				continue;
			}
			else 
			{
				temp+=arr[i];
			}
			
		 }
		}
		   System.out.println(temp);
		}
		
	
		
	}
