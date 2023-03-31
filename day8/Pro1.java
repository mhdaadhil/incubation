import java.util.Scanner;
public class Pro1{
	public static void main(String[]args )
	{
		int sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();
		System.out.println("enter the size of the element");
		int n= sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter the element");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			sum+=arr[i];
			if (sum==target)
				continue;
			else {
				System.out.println(arr[i]);
			    break;
			}
			
			
		}
	
			
		}
	}
