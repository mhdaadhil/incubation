import java.util.Scanner;
public class Charcount{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String des="";
		for(int i=0;i<str.length();i++)
		{
			des=des+str.charAt(i);
			int c=1;
			while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
			{
				c++;
				i++;
			}
			des+=c+"";
		}
		System.out.println(des);
	}
}