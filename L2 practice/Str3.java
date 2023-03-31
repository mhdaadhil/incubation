import java.util.Scanner;
public class Str3{
   public static void main(String []args){
	   Scanner sc = new Scanner(System.in);
	   String s=sc.next();
	   String str1="";
	   str1+=s.charAt(0);
	 //  System.out.println(str1);
	   String str2="";
	   String str3="";
	   int flag=0;
	   for(int i=1;i<s.length();i++)
	   {
		   str1+=s.charAt(i);
		  // System.out.println(str1);
		   for(int j=str1.length()-1;j>=0;j--)
		   {
			   str2+=str1.charAt(j);
			   
		   }
		  // System.out.println(str2);
		  
   		  if(str1.equals(str2))
		   {
			flag=1;
			str3+=str1+" ";
           // System.out.println("str3 = "+str3);	
			str1="";
			if(i!=s.length()-1)
            str1+=s.charAt(i+1);
           
		    if(i!=s.length()-1)
            i++;			
		   }
		   str2="";
	   }
	   if(flag==1){
		   System.out.println("Can be split into Palindrome substrings ");
	       System.out.println(str3+"are the Palindrome Substrings ");
	   }
	   else 
		   System.out.println("Can be split into Palindrome substrings ");
   }
}