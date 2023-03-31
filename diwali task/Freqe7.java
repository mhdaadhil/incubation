import java.util.Scanner;
public class Freqe7{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n");
		int n=sc.nextInt();
		int count;
		int arr[]=new int[n];
		System.out.println("enter the p");
		int p=sc.nextInt();
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
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