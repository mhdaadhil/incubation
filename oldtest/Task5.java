import java.util.Arrays;
import java.util.Scanner;

public class Task5{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("eneter the size");
	int n=sc.nextInt();
	int arr1[]=new int [n];
	System.out.println("eneter the elements");
	for(int i=0;i<n;i++)
	{
	  arr1[i]=sc.nextInt();
	}

	System.out.println("eneter the size");
	int m=sc.nextInt();
	int arr2[]=new int [m];
	System.out.println("eneter the elements");
	for(int i=0;i<m;i++)
	{
	  arr2[i]=sc.nextInt();
	}
	int arr3[]=new int[n+m];
	int k=0;
	for(int i=0;i<=(n+m)-1;i++)
	{
		if(i<n)
		{
			arr3[i]=arr1[i];
		}
		else {
			arr3[i]=arr2[k++];
			
		}
	}
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));
	if((n+m)%2==0)
	{
		int mid=(arr3[(n+m)/2]+arr3[((n+m)/2)-1])/2;
		System.out.println(mid);
	}
	else {
		System.out.println(arr3[(n+m)/2]);
	}
	
}
}