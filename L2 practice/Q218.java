import java.util.Scanner;
public class Q218{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String s="";
		char arr[]=str.toCharArray();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65&&arr[i]<=90)
			{
			    arr[i]+=32;
				s+=arr[i];
			}
			else
			  s+=arr[i];
		}
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("false");
		else 
			System.out.println("true");
			
		
		
	}
}