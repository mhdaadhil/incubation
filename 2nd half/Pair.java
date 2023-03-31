import java.util.Scanner;
public class Pair{
	public static void main(String [] args )
	{
		Scanner sc = new Scanner (System.in);
		int flag=0 ;
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		System.out.println("enetr the suze of the elemenets ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]!=sum) 
					flag++;
				
				else if (arr[i]+arr[j]==sum)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
					//arr[i]=0;
					//arr[j]=0;
					break;
				}
				
			  }
              }
		
		
		int a=n*2;		
		if (flag==a)
		{
			System.out.println("no pair exits for "+sum);
		}
			
		
	}
}