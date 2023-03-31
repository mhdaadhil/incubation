import java.util.Scanner;
public class Rec4{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		char arr[]=sc.next().toCharArray();
		per(arr,0,arr.length-1);
		
	}
	public static void per(char arr[],int k,int l){
		if (k==l)
		{
			for(int i=0;i<l+1;i++)
			{
				System.out.print(arr[i]);
				
			
			}
			System.out.println();
			return;
			
		}
		for(int i=k;i<=l;i++)
		{
			swap(arr,i,k);
			per(arr,k+1,l);
			swap(arr,i,k);
		}
		
	}
	public static void swap(char arr[],int i,int j)
	{
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}