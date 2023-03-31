import java.util.Scanner;
public class Queno2{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int num=0;
		for (int i=0;i<s.length();i++)
		{
			num*=26;
			num+=s.charAt(i)-'A'+1;
		}
		System.out.println(num);
	}
}