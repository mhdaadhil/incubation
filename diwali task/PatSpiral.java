import java.util.Scanner;
public class PatSpiral{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
	    int arr[][]= new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		spiral(r,c,arr);
	}
	public static void spiral(int r,int c,int arr[][]){
		
		int i,k=0,l=0;
		//k is starting of row index
		//l is starting of col index
		
		while(k<r && l<c)
		{
			for(i=l;i<c;i++)
			{
				System.out.println(arr[k][i]);
			}
			k++;
			
			for(i=k;i<r;i++)
			{
				System.out.println(arr[i][r-1]);
			}
			if(l<r)
			{
				
			}
			
			return;
		}
		
		
	}
	
}