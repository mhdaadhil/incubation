import java.util.Scanner;
public class Solq3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the number");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
			   if(arr[j]>arr[j+1])
			   {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
			}
		}
		//for(int i=0;i<n;i++)
		//System.out.println(arr[i]+" ");
	    int maxdiff=arr[n-1]-arr[0];
		int mindiff=arr[1]-arr[0];
		System.out.println("maximum difference = "+maxdiff+"\nminimum difference = "+mindiff);
	}
}