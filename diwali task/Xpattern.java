import java.util.Scanner;
public class Xpattern{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			int j=str.length()-1-i;
			for(int k=0;k<str.length();k++)
			{
				if(k==i||k==j)
				{
					System.out.print(str.charAt(k));
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}