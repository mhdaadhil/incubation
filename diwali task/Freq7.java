import java.util.Scanner;
public class Freq7{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		int str=sc.nextnt();
		int count;
		int arr[]=new int[n];
		System.out.println("enter the p");
		int p=sc.nextnt();
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextnt();
		}
		for(int i=1;i<=p;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if (i==arr[j])
				{
					count++;
				}
			}
			System.out.print(count+" ");
		}
			
	}
}