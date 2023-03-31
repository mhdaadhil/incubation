import java.util.Scanner;
public class A4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		int occ[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			occ[i]=-1;
		}
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			 occ[i]=count;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(occ[j]<occ[j+1])
				{
					int temp=occ[j];
					int temp1=arr[j];
					occ[j]=occ[j+1];
					arr[j]=arr[j+1];
					occ[j+1]=temp;
					arr[j+1]=temp1;
				}
			}
		}
		//System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}