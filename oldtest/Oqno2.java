import java.util.Scanner;
public class Oqno2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the number");
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
					arr[j]=-1;
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=-1)
			  System.out.print(arr[i]+",");
		  
		  else 
			  count++;
		}
			for(int i=0;i<count;i++){
				System.out.print("_");
				if(i<count-1)
		         {
			     System.out.print(",");
		         }
		
			}
			
		
	}
}