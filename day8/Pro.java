import java.util.Scanner;
public class Pro{
	public static void main(String[]args )
	{
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
			for (int j=i+1;j<n;j++){
				if (arr[i]+arr[j]!=target)
				   System.out.println("{"arr"}");
			         continue;
				  // else 
					  // System.out.println("{"+arr[i]+",}");
			}
			        
		}
	}
}