import java.util.Scanner;
public class Solq4{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("enter the size of 1st arr");
		int n =sc.nextInt();
		System.out.println("enter the size of 2nd arr");
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("enter the element");
		int k=0;
		for(int i=0;i<n+m;i++)
		{
			if(i<n)
			arr1[i]=sc.nextInt();
		    else{
			arr2[k]=sc.nextInt();
			k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if (arr1[i]==arr2[j])
				{
					arr2[j]=0;
				}
			}
		}
		int l=0;
		for(int i=0;i<n+m;i++)
		{
			if(i<n&&arr1[i]!=0)
			{
				count++;
			}
			else if(i>n&&arr2[l]!=0){
				count++;
				l++;
			}
				
		}
		System.out.println(count);
	
		
		
	}
}