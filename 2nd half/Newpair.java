import java.util.Scanner;
public class Newpair{
	public static void main(String [] args )
	{
	    Scanner sc = new Scanner (System.in);
		System.out.println("enter the Size of the element");
		int n= sc.nextInt();
		int arr[]=new int [n]; 
	
	    for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n-1;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if (arr[i]==arr[j]);
				{
					for (int k=j;k<n;k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
		}
		System.out.println("after del dup");
		for (int i=0;i<n;i++)
			System.out.println(arr[i]);
		
	}
}