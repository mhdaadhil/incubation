import java.util.Scanner;
public class Oqnoa1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	String s="";
	int d=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		d=d*10+arr[i];
		
	}
	d+=1;
	s+=d;
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]);
		if(i<n)
		{
			System.out.print(",");
		}
	}
	
	
	
	//System.out.println(d);
}
}