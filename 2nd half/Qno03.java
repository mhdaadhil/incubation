import java.util.Scanner;
public class Qno03{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int s=n;
		int r=n-1;
		int l=0;
		int limit=0;
		int arr[][]=new int[n][n];
		while (limit<n){
			for (int i=l;i<=r;i++)
			{
				for (int j=l;j<=r;j++)
				{
					if (i==l||i==r||j==l||j==r)
					{
						arr[i][j]=n;
					}
				}
			}
			l++;limit++;r--;n--;
		}
		for (int i=0;i<s;i++)
		{
			for (int j=0;j<s;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		 
	}
}