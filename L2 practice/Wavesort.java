import java.util.Scanner;
public class Wavesort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i+=2)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}