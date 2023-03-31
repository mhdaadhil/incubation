import java.util.Scanner;
public class Day2q7{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   String a=sc.next();
	   int result=0;
	   for(int i=0;i<a.length();i++)
	   {
		   result*=26;
		   result+=a.charAt(i)-'A'+1;
	   }
	   System.out.println(result);
	}
}