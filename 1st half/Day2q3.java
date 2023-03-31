import java.util.Scanner;
public class Day2q3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		//int a=1000;
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for (int i=0;i<n;i++)
		{
		     arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			int a=100;
			for (int j=0;j<n;j++)
			{
				if (arr[i]<arr[j]&&arr[j]<a)
				{
					a=arr[j];
				}
					
			}
			if (a==100)
			{
				System.out.println(arr[i]+"> ");
			}
			else 
			{
				System.out.println(arr[i]+">"+a);
			}
		
	
		}
	}
}