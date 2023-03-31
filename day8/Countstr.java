import java.util.Scanner;
public class Countstr{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		String str=sc.nextLine();
		int count=met(str);
         System.out.println("number of words in the string :"+count);		
		
	}
	public static int met(String str)
	{
		int count =1;
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==32)
				count++;
		}
		return count;
	}
	
}