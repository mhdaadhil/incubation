import java.util.Scanner;
public class Matarea{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int n =sc.nextInt();
		System.out.println("enter the colounm");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int copy[][]=new int[n][m];
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==1)
				{
					count++;
					copy[i][j]=count;

				}
				else
				{
					count=0;
					copy[i][j]=count;
				}
			}
		}
		int ans=0;
		int min=0;
		int rectangle=-1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				min=copy[i][j];
				for(int k=i;k<n;k++)
				{
					if(min==0)
					continue;
				    
					if(copy[k][j]==0)
					{
						min=0;
						continue;
					}
					if(copy[k][j]<min)
						min=copy[k][j];
		
						rectangle=min*(k-i+1);
						if(rectangle>ans)
							ans=rectangle;
					
				}
			}
			
		}
		System.out.println(ans);
		
	}
	
}
	