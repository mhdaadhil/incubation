import java.util.Scanner;

public class Day3q6{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String s =sc.next();
	String a="";
	String b="";
	int flag=0;
	char arr[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(arr[i]==arr[j])
			{
				if(arr[j]!='n')
				{
				a+=arr[i];
				b=arr[j]+b;
			   arr[i]='n';
			   arr[j]='n';
			   break;
				}
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!='n')
		{
			flag=1;
			System.out.println(a+arr[i]+b);
			break;
		}
	}
	if(flag==0)
	{
		System.out.println(a+b);
	}
	
}
	
}