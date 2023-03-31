import java.util.Scanner;
public class Solq1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  size");
		int n =sc.nextInt();
		int arr[]=new int[n];
		int mid1;
		int mid2;
		int c=0;
		if(n%2==0)
		{
			mid1=n/2;
			mid2=n/2;
		}
		else{
			mid1=(n/2)+1;
			mid2=(n/2);
		}
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int arr1[]=new int[mid1];
		int arr2[]=new int[mid2];
		int k=0;
		for(int i=0;i<n;i++){
			if(mid1>i)
			{
				arr1[i]=arr[i];
				
			}
			else 
			{
				arr2[k]=arr[i];
				k++;
			}
		}
		int l=0;
		for(int i=0;i<n;i++)
		{
			if(mid1>i)
			{
				System.out.print(arr1[i]+" ");
			}
			else 
			{
				if(c==0)
				{
					System.out.println();
					c++;
				}
			
				System.out.print(arr2[l]+" ");
				l++;
			}
		}
	}

}