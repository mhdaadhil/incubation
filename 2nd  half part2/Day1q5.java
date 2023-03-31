import java.util.Scanner;
public class Day1q5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int flag=0;
		int arr[]=new int[n];
		int count[]=new int[n];
		
		System.out.println("enter the element");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			count[i]=-1;
		}
		for(int i=0;i<n;i++)
		{
			flag=1;
			for (int j=i+1;j<n;j++)
			{
				if (arr[i]==arr[j])
				{
					flag++;
					count[j]=0;
					
				}
			}
			if (count[i]!=0){
				count[i]=flag;	
				}
			
		}
		for(int i=0;i<n;i++)
		{
			if(count[i]%2!=0)
			System.out.println(arr[i]);
		}
	}
}