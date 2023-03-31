import java.util.Scanner;
public class Eval8{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String");
	String str=sc.nextLine();
	
	int k=str.length()-1;
	boolean flag=true;
	for(int i=0;i<str.length();)
	{
		if(str.charAt(i)>=65&&str.charAt(i)<=90 && str.charAt(k)>=65&&str.charAt(k)<=90)
		{
			if(str.charAt(i)==str.charAt(k))
			{
				k--;
			    i++;
				continue;
			}
			else{
				flag=false;
				break;
			}
		}
		else if(str.charAt(i)>=32&&str.charAt(i)<=47||str.charAt(i)>=58&&str.charAt(i)<=64)
		{
		   i++;	
		}
		else if(str.charAt(k)>=32&&str.charAt(k)<=47||str.charAt(k)>=58&&str.charAt(k)<=64){
		   k--;
		}
		
	}
	if(flag==false)
	{
		System.out.println("its is not a palandrome");
	}
	else
	  System.out.println("its is a palandrome");
}
}