import java.util.Scanner;
public class Str1{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the  String");
	   String s1=sc.nextLine();
	   
	   String str[]=new String[10];
	   int k=0;
	   
	   System.out.println("enter the position you want to reverse");
	   String s=sc.next();
	   
	   String word="";
	  // String s2="";
	
	   for(int j=0;j<s1.length();j++)
	   {
		   char c =s1.charAt(j);
		   if(c!=32)
		   {
			   word+=c;
		   }
		   else{
			   str[k]=word;
			   word="";
			   k++;
		   }
		   
		   if(s1.length()-1==j){
			   str[k]=word;
		   k++;
		   }
	  }
	  
	  for(int i=0;i<k;i++)
	   {
		   if(i%2!=0&&s.equals("odd"))
		     str[i]=rev(str[i]);
		 
	       else if (i%2==0&&s.equals("even"))
			 str[i]=rev(str[i]); 
	   }
	   
	   for(int j=0;j<k;j++)
	   System.out.print(str[j]+" ");
	   
   }
   
   public static String rev(String a)
   {
	   String b="";
	   for(int i=a.length()-1;i>=0;i--)
	   {
		   b+=a.charAt(i);
	   }
	   return b;
   }
}