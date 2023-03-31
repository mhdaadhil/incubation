import java.util.Scanner;
public class Day3q5{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int a=str.charAt(1)-str.charAt(0);
		//System.out.println(a);
		String r="";
		int flag=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			r+=str.charAt(i);
		}
		//System.out.println(r);
		for (int i=0;i<r.length();i++)
		{
			for (int j=i+1;j<r.length();j++)
			{
				if(r.charAt(i)-r.charAt(j)==a)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==0)
			        break;
		}
		if (flag==1)
		{
			System.out.println("equal difference");
		}
		else 
			System.out.println("unequal difference");
		
	}
}