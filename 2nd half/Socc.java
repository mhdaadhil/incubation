import java.util.Scanner;
public class Socc{
	static int max=256;
	public static void main(String[] strgs )
	{
		Scanner sc = new Scanner (System.in);
		String str= sc.next();
		occurence(str);
	}
	public static void occurence(String str){
		int count[]=new int[max];
		int len=str.length();
		for (int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		char ch[]=new char[str.length()];
		for (int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for (int j=0;j<=i;j++)
			{
				if (str.charAt(i)==ch[j])
					find++;
			}
			if (find==1)
				System.out.println("the occurenc of "+str.charAt(i)+"is :"+count[str.charAt(i)]);
		}
		
	}
}