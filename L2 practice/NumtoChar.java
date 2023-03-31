import java.util.Scanner;
public class NumtoChar{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the number");
	  int n =sc.nextInt();
	  String s="";
	  while (n>0)
	  {
		  char c =(char)((n-1)%26+'A');
		  s=c+s;
		  n=(n-1)/26;
	  }
	  System.out.println(s);
  }
}