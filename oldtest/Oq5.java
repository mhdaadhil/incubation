import java.util.Scanner;
public class Oq5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int result=arr[0]*arr[1]*arr[2];
		System.out.println(result);
		System.out.println("multiplication of "+arr[0]+" "+arr[1]+" "+arr[2]);
	}
}