import java.util.Scanner;
public class Day2q5{
	public static void main(String[]args){
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the size");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("enter the elements");
		for (int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int temp[]=new int[m+n];
		for(int i=0;i<n;i++,k++)
		{
			temp[k]=arr[i];
		}
		for(int i=0;i<m;i++,k++)
		{
			temp[k]=arr1[i];
		}
		for(int i=0;i<m+n;i++)
		{
		   for (int j=i+1;j<m+n;j++)
		   {
			   if (temp[i]==temp[j])
			   {
				   temp[i]=0;
				   temp[j]=0;
			   }
		   }
		}
		for(int i=0;i<o;i++)
		{
			if (temp[i]!=0)
			{
				int a= i<n?1:2;
				System.out.println(temp[i]+" is the extra element in array "+a+" at index "+i);
			}
		}
		
		
	}
	
}