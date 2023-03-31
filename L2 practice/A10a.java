import java.util.Scanner;
public class A10a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length()-1;
		
		String temp="";
		for(int i=0,j=n-1;i<n,j>=0;){
			 if((s.charAt(i)>=97&&s.charAt(i)<=122) && (s.charAt(j)>=97&&s.charAt(j)<=122))
		  {
			   System.out.print(s.charAt(i));
			  i++;
			  j--;
		  }
		  
		}
	}
}