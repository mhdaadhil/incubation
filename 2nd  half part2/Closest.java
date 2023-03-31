import java.util.Scanner;

public class Closest{
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int temp=0;
	int sum=0;
	System.out.println("enter the target");
	int target=sc.nextInt();
	System.out.println("how many elements");
	int n=sc.nextInt();
	int arr[]=new int [n];
	System.out.println("enter the elements");
	
	for (int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for (int i=0;i<n;i++)
	{
		for (int j=0;j<n-i-1;j++)
		{
			if(arr[j]<arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for (int i=0;i<n;i++)
	{
		if (arr[i]==target)
		{
			sum=arr[i]+arr[i+1]+arr[i-1];
		}

	}
	System.out.println(sum);
	}
	
}



