//3
import java.util.Scanner;
public class Oq6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int temp=0;
		for(int i=0;i<n;i+=2)
		{
			temp=arr[n-1];
			for(int j=n-1;j>i;j--){
				arr[j]=arr[j-1];
			}
			arr[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			if(i<n-1)
			System.out.print(",");
		}
	}
}