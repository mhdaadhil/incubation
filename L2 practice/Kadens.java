import java.util.Scanner;
public class Kadens{
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
	 int max=arr[0];
	 for(int i=0;i<n;i++)
	 {
		 int res=0;
		 for(int j=i;j<n;j++)
		 {
			 res+=arr[j];
			 if(res>max)
			 {
				 max=res;
			 }
		 }
	 }
	 System.out.println(max);
	 
  }
}