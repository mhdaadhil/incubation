import java.util.Scanner;
public class Qs1{
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the String");
	 String s = sc.next();
	 int count;
	 int max=0;
	// count=1;
	 for(int i=0;i<s.length();i++)
	 {
		 count=1;
		 for(int j=i+1;j<s.length();j++)
		 {  
	         
			 if(s.charAt(i)==s.charAt(j))
		    {
				 
			    if(max<count)
				{
					 System.out.println(s.charAt(i)+" - "+s.charAt(j));
				 max=count;
				  System.out.println("max");
				 System.out.println(max);
				// count=1;
				  System.out.println("count");
				 System.out.println(count);
				 System.out.println("break");
				 
			    }
				break;
			}
			 else{
				 count++;
				  System.out.println("else count");
				  System.out.println(count);
				   System.out.println(s.charAt(i)+" - "+s.charAt(j));
			 }
				 
		 }
	 }
	 System.out.println(max);
 }
}