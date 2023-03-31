import java.util.Scanner;
public class Vow{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String str= sc.next();
		int count = met(str);
		System.out.println("num of vowels is "+count);
	}
	public static int met(String str)
	{
		int count =0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count++;
			else if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
				count++;
			
		}
		return count;
		
	}

}