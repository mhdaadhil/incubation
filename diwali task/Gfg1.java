import java.util.Scanner;
public class Gfg1{
	public static void (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elment");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]+=arr[j];
					arr[j]=0;
				}
				
			}
		}
		
	}
}