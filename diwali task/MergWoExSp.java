import java.util.Scanner;
public class MergWoExSp{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first array");
		int n=sc.nextInt();
		System.out.println("enter the 2nd array size");
	    int m=sc.nextInt();
		int k=0;
		int arr[]=new int[n+m];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++)
		{
			arr[k]=sc.nextInt();
			k++;
		}
		System.out.println("enter the elements");
		for(int i=0;i<m;i++)
		{
		 arr[k]=sc.nextInt();
		 k++;
		}
		System.out.println();
		for(int i=0;i<(n+m);i++)
		{
			for(int j=0;j<(n+m)-i-1;j++)
			{ 
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int o=0;
		for(int i=0;i<n+m;i++)
		{
			if(i<n)
			{
				System.out.print(arr[o]+" ");
				o++
			}
		}
		System.out.println();
		for(int i=o;i<n+m;i++)
		{
			//if(i>=n)
			//{
				System.out.print(arr[i]+" ");
			//}
			
		}
	}
}