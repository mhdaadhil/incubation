import java.util.Scanner;
public class Eval3{
	public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  String s1=sc.next();
	  String s2=sc.next();
	  int min=10000;
	  int max=0;
	  
	  for(int i=0;i<s2.length();i++)
	  {
		  for(int j=0;j<s1.length();j++)
		  {
			 if(s2.charAt(i)==s1.charAt(j))
			 {
				 if(j>max)
				 {
					 max=j;
				 }
				 if(j<min){
					 min=j;
				 }
				 break;
			 }
           			 
		  }
	  }
	 // System.out.println(max+"\n"+min);
	  for(int i=min;i<=max;i++)
	  {
		 System.out.print(s1.charAt(i)) ;
	  }
	  
	}
}