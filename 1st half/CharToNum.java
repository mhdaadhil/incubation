import java.util.Scanner;
public class CharToNum{
   public static void main(String [] args){
	   Scanner sc = new Scanner(System.in);
	   String a =sc.next();
	   int res=0;
	   for(int i=0;i<a.length();i++)
	   {
		   res*=26;
		   res+=a.charAt(i)-'A'+1;
	   }
	   System.out.println(res);
   }
}