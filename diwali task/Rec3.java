import java.util.Scanner;
public class Rec3{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   String str=sc.next();
	   grey(str,0);
	   
   }
   public static void grey(String str,int i){
	   if(i==str.length())
		   return;
	   
	   else if(i==0)
	   {
		   System.out.print(str.charAt(i));
		   grey(str,i+1);
	   }
	   else if(str.charAt(i)!=str.charAt(i-1))
	   {
		   System.out.print(1);
		   grey(str,i+1);
	   }
	   else
	   {
		   System.out.print(0);
		   grey(str,i+1);
	   }
	   
   }
}