import java.util.Scanner;
public class StrRev{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String word="";
	    String rev="";
		String str=reverse(s,word,rev,0);
		System.out.println(str);
		
		}
	public static String reverse(String s,String word,String rev,int i){
		
		if(i==s.length())
		{
			rev=word+" "+rev;
			return rev;
		}
		char c =s.charAt(i);
		
		if(s.charAt(i)!=32)
			return reverse(s,word+c,rev,i+1);
		else
		{			
	     return reverse(s,"",word+" "+rev,i+1);
		}
		
	}
	
}