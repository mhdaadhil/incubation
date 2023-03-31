import java.util.Scanner;
public class Occ{
	public static void main(String[] args ){
		int count =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of the element");
		
		int n=sc.nextInt();
		int arr[]=new int [n];
		int arr2[]=new int [n];
		for (int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		   arr2[i]=-1;
		}
		for (int i=0;i<n;i++)
		{
			count=1;
			for (int j=i+1;j<n;j++)
			{
				if (arr[i]==arr[j])
				{
				count++;
				arr2[j]=0;
				}
			}
			if (arr2[i]!=0)
				arr2[i]=count;
			
			if (arr2[i]!=0)
				System.out.println(arr[i]+"-"+arr2[i]);
				
		}
	}
}