import java.util.Scanner;
public class Eval9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int ans[]=new int[n];
		System.out.println("enter the element");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=0;
					break;
				}
				else
					break;
			}
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]!=0)
			{
				ans[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(ans[i]+" ");
		}
	}
}