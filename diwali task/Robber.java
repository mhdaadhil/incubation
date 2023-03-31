import java.util.Scanner;
public class Robber{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++)
		{
			int ippathirudunadhu=sum1+arr[i];
			
			sum1=sum1>sum2?sum1:sum2;
			
			sum2=ippathirudunadhu;
		}
		System.out.println(sum1>sum2?sum1:sum2);
	}
}