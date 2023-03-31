import java.util.Scanner;
public class Str6{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the string");
	   String s =sc.nextLine();
	   System.out.println("enter the first string");
	   String s1=sc.next();
	   System.out.println("enter the second string");
	   String s2=sc.next();
	   
	   String word="";
	   
	   for(int i=0;i<s.length();i++)
	   {
		   char c=s.charAt(i)
		   if(c!=32){
			   word+=c;
		   }
		   else
		   {
			  if(word.equals(s1))
			  {
				  
			  }
		   }
	   }

   }
}