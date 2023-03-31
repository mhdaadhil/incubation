import java.util.Scanner;
/*
22. You’re given an even number n. If n=4, you have to print the
following pattern :
4444
4334
4334
4444
If n=6, then the pattern should be like this :
666666
655556
654456
654456
655556
666666
*/


public class Qno22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
                int n =num*2-1;
		int s=n;
		int r=n-1;
		int limit=0;
		int l=0;
		int arr[][]=new int [n][n];
		while (limit<n) {
		for (int i=l;i<=r;i++)
		{
			for (int j=l;j<=r;j++)
			{
				if(i==l||i==r||j==l||j==r)
					arr[i][j]=num;
			}
		}
		l++;num--;r--;limit++;
	}
	for (int i=0;i<s;i++) {
		for(int j=0;j<s;j++) {
			System.out.print(arr[i][j]);
	
	}
		System.out.println();
	}
	
		
	}
}
