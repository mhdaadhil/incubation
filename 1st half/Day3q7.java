import java.util.Scanner;
public class Day3q7{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==' ')
				count++;
		}
		String arr[]=new String[count];
		
	    for(int i=0;i<count;i++)
			arr[i]="";
		
		int k=0;
		for (int j=0;j<s.length();j++)
		{
			if(s.charAt(j)!=' ')
			{
				arr[k]+=s.charAt(j);
			}
			else 
			{
				k++;
			}
		}
	   for(int i=0;i<count;i++)
	   {
		   for(int j=i+1;j<count;j++)
		   {
			   if(arr[i].equals(arr[j]))
				   arr[j]="null";
		   }
	   }
	   for(int i=0;i<count;i++)
	   {
		  if(arr[i]!="null")
		  System.out.print(arr[i]+" ");
	   }
	}
}