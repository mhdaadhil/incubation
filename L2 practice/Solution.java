import java.util.Scanner;

public class Solution{
public static void main(String[]args){
   
    Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the row");
	int n=sc.nextInt();
	
	System.out.println("enter the colounm");
	int m=sc.nextInt();
	
	int arr[][]=new int[n][m];
	System.out.println("enter the array");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	 System.out.println(maxArea(arr,n,m));
	
}
public static int maxArea(int a[][], int n, int m) {


        int[][] copy = new int[n][m];
        
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            count = 0;
            for(int j = 0; j < m; j++)
            {
                if(a[i][j]==1)
                {
                    count++;
                    copy[i][j]=count;
                 }
                 else
                 {
                     count = 0;
                     copy[i][j] = count;
                 }
            }
        }
		
        for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.print(copy[i][j]+" ");
		}
		System.out.println();
	}
        
        int ans = 0;
        int min = 0;
        int rectangle = -1;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                min = copy[i][j];
                
                for(int k = i; k < n; k++)
                {
                    if(min == 0)
                        continue;
                    
                    if(copy[k][j]==0)
                    {
                        min = 0;
                        continue;
                    }
                    
                    if(copy[k][j]<min)
                        min = copy[k][j];
                    
                    rectangle = min * (k-i+1);
                    
                    if(rectangle>ans)
                        ans = rectangle;
                    
                }
            }
        }
        
        return ans;
        
    }
  
}