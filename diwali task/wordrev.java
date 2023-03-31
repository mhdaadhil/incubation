import java.util.Scanner;
public class Wordrev{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		String word="";
		s+=" ";
		rev= reverse(s,rev,word,0);
		System.out.println(rev);
	}
	public static String reverse(String s,String rev,String word,int i){
		
		if(i==s.length())
		{
			return rev;
		}
		char c=s.charAt(i);
		if(c!=32)
		{
			return reverse(s,rev,word+c,i+1);
		}
		else
			return reverse(s,word+" "+rev,"",i+1);
	}
}