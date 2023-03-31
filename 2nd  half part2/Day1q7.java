import java.util.Scanner;
public class Day1q7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int small;
		int arr[]=new int[n];
		int c=0;
		System.out.println("enter the element");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			small=i;
			for(int j=i+1;j<n;j++)
			{
				if (arr[j]<arr[small])
					small=j;		
			}
			if (i<small){
			int temp=arr[small];
				arr[small]=arr[i];
				arr[i]=temp;
				c++;
			}
		}
		//for (int i=0;i<n;i++)
		//{
			//System.out.print(arr[i]);
			System.out.println(c);
		//}
			
		
		
	}
}