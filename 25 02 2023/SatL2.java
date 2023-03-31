import java.util.Scanner;
public class SatL2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		String word=word(str);
		int flag=0;
		for(int i=0;i<word.length();i++)
		{
			for(int j=i+1;j<word.length();j++)
			{
				if(word.charAt(i)==word.charAt(j)){
					flag=1;
					break;
				}				 
			}
		}
		if(flag==1)
			System.out.println(false);
		else 
			System.out.println(true);
		
	}
	public static String word(String str){
		  String word="";
		  char a;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90){
				a=(char)(str.charAt(i)+32);
				word+=a;
			}
			else 
				word+=str.charAt(i);
		}
		//System.out.println(word);
		return word;
	}
}