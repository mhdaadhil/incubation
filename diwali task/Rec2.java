import java.util.Scanner;
public class Rec2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
	    int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		subseq(arr,0,0);
		
	}
	public static void subseq(int arr[],int i,int j)
	{
		if(i==arr.length)
			return;
		
		else if(i==j)
		{
			System.out.print(arr[i]);
			subseq(arr,i,j+1);
		}
		else if(j<arr.length)
		{
			System.out.print(" ");
			for(int k=i;k<=j;k++)
			{
				System.out.print(arr[k]);
				
			}
			subseq(arr,i,j+1);
		}
		else{
			subseq(arr,i+1,0);
		}
	}
}