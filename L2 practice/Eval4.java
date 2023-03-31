import java.util.Scanner;
public class Eval4{
	public static void main(String []args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the size");
	 int n =sc.nextInt();
	 int arr[][]=new int[n][n];
	 System.out.println("enter the array element");
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 int k=n;
	 int sum=0;
	  for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<k;j++)
		 {
			sum+=arr[i][j];
		 }
		 k--;
	 }
	 //System.out.println(sum);
	 int m=n-1;
	 int total=0;
	 for(int i=0;i<n;i++)
	 {
		 for(int j=m;j<n;j++)
		 {
			total+=arr[i][j];
		 }
		 m--;
	 }
	 System.out.println(total>sum?total:sum);
	 
	}
}