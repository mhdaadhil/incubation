import java.util.Scanner;

public class Qno04{
public static void main(String[] args) {
	 int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int n=sc.nextInt();
	String arr[]=new String[n];
    int size[]=new int[n]; 
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.next();
		size[i]=arr[i].length();
	}
	System.out.println("type any word");
	String name =sc.next();
	for (int i=0;i<n;i++)
	{
		count=0;
		if (size[i]==name.length())
		{
		   for (int j=0;j<name.length();j++)
		   {
			   for (int k=0;k<name.length();k++)
			   {
				   if (arr[i].charAt(j)==name.charAt(k))
				   {
					
					count++;
					break;
				   }
				}
		      }
		    }
		if(count==name.length())
		{
			System.out.println(arr[i]);
		}
	}
}
}
