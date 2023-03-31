import java.util.Scanner;
public class prac{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n =num*2-1;
		int s=n;
		int limit=0;
		int l=0;
		int r=n-1;
		
		int arr[][]= new int[n][n];
        while(limit<n)
		{
			for(int i=l;i<=r;i++)
			{
				for(int j=l;j<=r;j++)
				{
					if(i==l||i==r||j==l||j==r)
					{
						arr[i][j]=num;
					}
				}
			}
			l++;r--;num--;limit++;
		}
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
			
	}
}