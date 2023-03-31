import java.util.*;
public class Mergtwolinkl10{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the linked list");
		int n=sc.nextInt();
		LinkedList<Integer>l1=new LinkedList<Integer>();
		System.out.println("enter the elements");
		int i;
		for(i=0;i<n;i++)
		{
			l1.add(i,sc.nextInt());
		}
		int m=sc.nextInt();
		for(int j=0;j<m;j++,i++)
		{
			l1.add(i,sc.nextInt());
		}
		l1.sort(null);
		System.out.println(l1);
		
		
		
		
	}
}