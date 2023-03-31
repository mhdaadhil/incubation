import java.util.Scanner;
public class SatL2_4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*int right
		for(int i=0;i<n;i++){
			 
		}
		//
	}
	public static int find(int arr[],int i,int n){
		int sum=0;
		for(int j=i;j<n;i++){
			sum+=arr[i];
		}
		return sum;
		*/
		System.out.println(findPivot(arr,n));
		
		
	}
	public static int findPivot(int arr[],int n){
		int rightSum=0;
		int leftSum=0;
		
		for(int i=0;i<n;i++)
			rightSum+=arr[i];
		
		for(int i=0;i<n;i++)
		{
			rightSum-=arr[i];
			if(rightSum==leftSum)
				return i;
			leftSum+=arr[i];
			
		}
		return -1;
	}
}