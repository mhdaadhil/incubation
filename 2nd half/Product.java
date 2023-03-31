import java.util.Scanner;
public class Product{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int temp=0;
		
		System.out.println("enter the size of the elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++)
		{
		  arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
			
		}
		int product=arr[0]*arr[1]*arr[2];
		System.out.println(product);
		System.out.println("the product elements are "+arr[0]+"&"+arr[1]+"&"+arr[2]);
		
	}
}