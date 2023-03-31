import java.util.Scanner;
public class Midchar{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
	    String Str=sc.next();
        // mid=str.length()/2;
		int centerr = center(Str);
		System.out.println(Str.charAt(centerr));
	  }
	  public static int center(String a){
		  int len=a.length();
		  int mid =len/2;
		     return mid; 
	  }
}