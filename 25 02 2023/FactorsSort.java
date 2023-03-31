import java.util.Scanner;
public class FactorsSort{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]= new int[n];
	    int count[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int count1 =0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0){
					count1++;
				}
			}
			count[i]=count1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" - "+count[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(count[i]>count[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}