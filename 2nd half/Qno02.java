import java.util.Scanner;

public class Qno02{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the word ");
		String a=sc.next();
		int flag=0;
		int n=a.length();
	    for(int i=0;i<n;i++)
	    {
	    for (int j=0;j<n;j++)
	    {
	    	if (a.charAt(i)==a.charAt(j))
	    	{
	    		if(flag<j-i)
	    		{
	    			flag=j;
	    		}
	    	}
	    }
	    }
		System.out.println(flag-1);

	}
}
