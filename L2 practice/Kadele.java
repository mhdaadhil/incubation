import java.util.Scanner;
public class Kadele{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++){
		  arr[i]=sc.nextInt();
		}
		System.out.println("enter the elemnt");
		int max=arr[0];
		//String ele="";
		for(int i=0;i<n;i++)
		{
			int res=0;
			for(int j=i;j<n;j++)
			{
				res+=arr[j];
				//ele+=arr[j];
				if(res>max)
				{
					max=res;
					//ele="";
				}
			}
		}
		System.out.println(max);
		System.out.println(ele);
	}
}