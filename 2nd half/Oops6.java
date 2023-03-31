import java.util.Scanner;
class Oops6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(Sytem.in);
		System.out.println("Enter the number of elements")
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				i=0;
				continue;
			}
			else if(a[i]==-1)
				break;
			
			
			
		}
	}
}