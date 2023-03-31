import java.util.Scanner;
public class Day3q3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String 1");
		String s1=sc.next();
		System.out.println("enter the String 2");
	    String s2=sc.next();
	    char arr[]=s1.toCharArray();
	    char arr1[]=s2.toCharArray();
		sort(arr,s1.length());
		sort(arr1,s2.length());
		
	}
	public static void sort(char arr[],int n){
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if (arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				   //System.out.print(arr[j]);
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	     System.out.println();
	}
}