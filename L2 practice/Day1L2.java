import java.util.Scanner;
public class Day1L2{
	public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
	   System.out.println("enter the  size");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   int occ[]-new int [n];
	   int count=0;
	   
	   for(int i=0;i<n;i++){
		   arr[i]=sc.nextInt();
		   occ[i]=-1;
	   }
	   
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n-i-1;j++)
		   {
			   if(arr[j]<arr[j+1])
			   {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
	   }
	   
	   for(int i=0;i<n;i++)
	   {
		   count =1;
		   for(int j=i+1;i<n;j++)
		   {
			   if(arr[i]==arr[j]){
				   count++;
				   occ[j]=0;
				}
		   }
		   if(occ[i]!=0)
		   {
			   occ[i]=count;
		   }
	   }
	    for(int i=0;i<n;i++){
		   System.out.println(occ[i]+" ");
	   
	  
	   
	   
	}
	
}
