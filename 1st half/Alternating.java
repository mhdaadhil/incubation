import java.util.Scanner;
public class Alternating{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if (arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i=0;i<n;i+=2)
		{
			int temp=arr[n-1];
			for (int j=n-1;j>i;j--)
			{
			  arr[j]=arr[j-1]; 
			}
			arr[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}