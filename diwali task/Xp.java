import java.util.Scanner;
public class Xp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the odd String");
		String s =sc.next();
		for(int i=0;i<s.length();i++)
		{
			int j=s.length()-1-i;
			for(int k=0;j<s.length();k++)
			{
				if(i==k||j==k)
				{
					System.out.print(s.charAt(k));
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
}