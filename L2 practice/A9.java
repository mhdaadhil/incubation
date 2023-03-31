import java.util.Scanner; 
public class A9{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the element");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  System.out.println("enter the array element");
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int sum=arr[0];
	  for(int i=0;i<n;i++)
	  {
		  int temp=0;
		  for(int j=i;j<n;j++)
		  {
			  temp+=arr[j];
			  if(temp>sum)
			  {
				  sum=temp;
			  }
		  }
	  }
	  System.out.println(sum);
	  
	  
  }
}