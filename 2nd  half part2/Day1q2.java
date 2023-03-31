import java.util.Scanner;
public class Day1q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int count=0;
		System.out.println("enter the size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the size ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			a=0;
			for(int j=i;j<n;j++)
			{
				a+=arr[j];
				if (a==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}