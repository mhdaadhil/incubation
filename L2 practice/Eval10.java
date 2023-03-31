import java.util.Scanner;
public class Eval10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]+arr[j]==sum){
					count++;
					System.out.print("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		System.out.print(" "+count);
	
	}
}